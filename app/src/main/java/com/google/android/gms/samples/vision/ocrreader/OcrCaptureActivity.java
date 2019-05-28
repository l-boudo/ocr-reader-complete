/*
 * Copyright (C) The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.gms.samples.vision.ocrreader;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.location.Address;
//import com.google.android.gms.location.FusedLocationProviderClient
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;
import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.samples.vision.ocrreader.ui.camera.CameraSource;
import com.google.android.gms.samples.vision.ocrreader.ui.camera.CameraSourcePreview;
import com.google.android.gms.samples.vision.ocrreader.ui.camera.GraphicOverlay;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import com.soap.AsyncSoap;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import custom.JsonFetcher;
import custom.SSLConection;
import custom.UserInfo;

/**
 * Activity for the Ocr Detecting app.  This app detects text and displays the value with the
 * rear facing camera. During detection overlay graphics are drawn to indicate the position,
 * size, and contents of each TextBlock.
 */
public final class OcrCaptureActivity extends AppCompatActivity implements LocationListener {

    private static final String TAG = "OcrCaptureActivity";
    int MY_PERMISSION_ACCESS_COARSE_LOCATION = 1;
    int MY_PERMISSION_ACCESS_FINE_LOCATION = 2;
    public static String API_URL2 = "https://public.opendatasoft.com/api/v2/catalog/datasets/correspondance-code-insee-code-postal";
    public static String API_URL = "https://public.opendatasoft.com/api/v2/catalog/datasets/correspondance-code-insee-code-postal/records?where=";

    // Intent request code to handle updating play services if needed.
    private static final int RC_HANDLE_GMS = 9001;

    // Permission request codes need to be < 256
    private static final int RC_HANDLE_CAMERA_PERM = 2;
    private static final int RC_HANDLE_LOCATION_PERM = 3;

    // Constants used to pass extra data in the intent
    public static final String AutoFocus = "AutoFocus";
    public static final String UseFlash = "UseFlash";
    public static final String TextBlockObject = "String";
    public static String keystore;
    public static String truststore;

    private CameraSource cameraSource;
    private CameraSourcePreview preview;
    private GraphicOverlay<OcrGraphic> graphicOverlay;

    // Helper objects for detecting taps and pinches.
    private ScaleGestureDetector scaleGestureDetector;
    private GestureDetector gestureDetector;

    // A TextToSpeech engine for speaking a String value.
    private TextToSpeech tts;

    private TextRecognizer textRecognizer;

    // pour savoir si on arrete ou non la capture de données
    private boolean lock = false;

    // TODO: faire un observer etc
    private UserInfo user;
    private LocationManager locationManager;


    private FusedLocationProviderClient fusedLocationClient;

    private BaseLoaderCallback mLoaderCallback = new BaseLoaderCallback(this) {
        @Override
        public void onManagerConnected(int status) {
            switch (status) {
                case LoaderCallbackInterface.SUCCESS: {
                    Log.i("OpenCV", "OpenCV loaded successfully");
                }
                break;
                default: {
                    super.onManagerConnected(status);
                }
                break;
            }
        }
    };

    /**
     * Initializes the UI and creates the detector pipeline.
     */
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        //R.raw.keystore;
        Uri path = Uri.parse("android.resource://" + getApplicationContext().getPackageName()+ "/" +  R.raw.keystore);
        Uri path2 = Uri.parse("android.resource://" + getApplicationContext().getPackageName()+ "/" +  R.raw.truststore);

        keystore = path.getPath();
        truststore = path2.getPath();

        Log.d("PathTest", " - "+path.getPath()+" - ");

        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        final Context context = getApplicationContext();
        setContentView(R.layout.ocr_capture);
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        preview = findViewById(R.id.preview);
        graphicOverlay = findViewById(R.id.graphicOverlay);
        TextView t = findViewById(R.id.infos_user);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        // Hide ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        //final TextInputLayout ti = (TextInputLayout) findViewById(R.id.adress_input);

        //final TextInputEditText tie = (TextInputEditText) findViewById(R.id.adress_input);
        user = new UserInfo(t);
        // Set good defaults for capturing text.
        boolean autoFocus = true;
        boolean useFlash = false;

        // Check for the camera permission before accessing the camera.  If the
        // permission is not granted yet, request permission.
        int rc = ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA);
        if (rc == PackageManager.PERMISSION_GRANTED) {
            createCameraSource(autoFocus, useFlash);
        } else {
            requestCameraPermission();
        }
        int rfl = ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        int rcl = ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION);
        if (rfl == PackageManager.PERMISSION_GRANTED && rcl == PackageManager.PERMISSION_GRANTED) {
            createCameraSource(autoFocus, useFlash);
        } else {
            requestGpsPermission();
        }


        gestureDetector = new GestureDetector(this, new CaptureGestureListener());
        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());

        Snackbar.make(graphicOverlay, "Tap to Speak. Pinch/Stretch to zoom",
                Snackbar.LENGTH_LONG)
                .show();

        // Set up the Text To Speech engine.
        TextToSpeech.OnInitListener listener =
                new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(final int status) {
                        if (status == TextToSpeech.SUCCESS) {
                            Log.d("OnInitListener", "Text to speech engine started successfully.");
                            tts.setLanguage(Locale.US);
                        } else {
                            Log.d("OnInitListener", "Error starting the text to speech engine.");
                        }
                    }
                };
        tts = new TextToSpeech(this.getApplicationContext(), listener);

        final Button button_lock = findViewById(R.id.lock_button);
        button_lock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                //lock = !lock;
                //button_lock.setBackgroundTintList();
                String text_lock;
                if (user.setLock()) {
                    text_lock = "Bloqué";
                    //button_lock.setText("Locked");
                } else {
                    //button_lock.setText("Unlocked");
                    text_lock = "Débloqué";

                }
                Snackbar.make(graphicOverlay, "le texte est " + text_lock,
                        Snackbar.LENGTH_LONG)
                        .show();
            }

        });

        final Button button_placeholder = findViewById(R.id.placeholder_test);
        button_placeholder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                //user.placeholder();
                showMyDialog(OcrCaptureActivity.this);

            }

        });

        final Button button_gps = findViewById(R.id.gps_button);
        button_gps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                checkLocationPermission();
                locationManager.requestSingleUpdate(LocationManager.NETWORK_PROVIDER, OcrCaptureActivity.this, null);
                Location loc = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                if(loc!=null){
                    user.setLocation(loc);
                    Geocoder gCoder = new Geocoder(context);
                    try {
                        List<Address> addresses = gCoder.getFromLocation(loc.getLatitude(), loc.getLongitude(), 1);
                        Log.d("LocationTest", " Approx "+addresses);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                Log.d("LocationTest", " - "+loc+" - ");
                loc = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            }

        });
    }

    private void requestGpsPermission() {

    }
    /**
     * Handles the requesting of the camera permission.  This includes
     * showing a "Snackbar" message of why the permission is needed then
     * sending the request.
     */
    private void requestCameraPermission() {
        Log.w(TAG, "Camera permission is not granted. Requesting permission");

        final String[] permissions = new String[]{Manifest.permission.CAMERA};

        if (!ActivityCompat.shouldShowRequestPermissionRationale(this,
                Manifest.permission.CAMERA)) {
            ActivityCompat.requestPermissions(this, permissions, RC_HANDLE_CAMERA_PERM);
            return;
        }

        final Activity thisActivity = this;

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.requestPermissions(thisActivity, permissions,
                        RC_HANDLE_CAMERA_PERM);
            }
        };

        Snackbar.make(graphicOverlay, R.string.permission_camera_rationale,
                Snackbar.LENGTH_INDEFINITE)
                .setAction(R.string.ok, listener)
                .show();
    }
    public boolean checkLocationPermission()
    {
        String permission = "android.permission.ACCESS_FINE_LOCATION";
        int res = this.checkCallingOrSelfPermission(permission);
        return (res == PackageManager.PERMISSION_GRANTED);
    }
    @Override
    public boolean onTouchEvent(MotionEvent e) {
        boolean b = scaleGestureDetector.onTouchEvent(e);

        boolean c = gestureDetector.onTouchEvent(e);

        return b || c || super.onTouchEvent(e);
    }

    /**
     * Creates and starts the camera.  Note that this uses a higher resolution in comparison
     * to other detection examples to enable the ocr detector to detect small text samples
     * at long distances.
     *
     * Suppressing InlinedApi since there is a check that the minimum version is met before using
     * the constant.
     */
    @SuppressLint({"InlinedApi", "LongLogTag"})
    private void createCameraSource(boolean autoFocus, boolean useFlash) {
        Context context = getApplicationContext();

        // A text recognizer is created to find text.  An associated multi-processor instance
        // is set to receive the text recognition results, track the text, and maintain
        // graphics for each text block on screen.  The factory is used by the multi-processor to
        // create a separate tracker instance for each text block.

        textRecognizer = new TextRecognizer.Builder(context).build();
        textRecognizer.setProcessor(new OcrDetectorProcessor(graphicOverlay,user));
        try {
            //Bitmap image = BitmapFactory.decodeResource(getResources(),R.drawable.digit2);
            //Frame frame = new Frame.Builder().setBitmap( image ).build();
            //textRecognizer.detect(frame);
            //Log.d("OcrDetectorProcessorDigit", String.valueOf(textRecognizer.detect(frame).get(0).getValue()));
        }catch (Exception e){

            Log.d("Error", e.getMessage() );
        }

        if (!textRecognizer.isOperational()) {
            // Note: The first time that an app using a Vision API is installed on a
            // device, GMS will download a native libraries to the device in order to do detection.
            // Usually this completes before the app is run for the first time.  But if that
            // download has not yet completed, then the above call will not detect any text,
            // barcodes, or faces.
            //
            // isOperational() can be used to check if the required native libraries are currently
            // available.  The detectors will automatically become operational once the library
            // downloads complete on device.
            Log.w(TAG, "Detector dependencies are not yet available.");

            // Check for low storage.  If there is low storage, the native library will not be
            // downloaded, so detection will not become operational.
            IntentFilter lowstorageFilter = new IntentFilter(Intent.ACTION_DEVICE_STORAGE_LOW);
            boolean hasLowStorage = registerReceiver(null, lowstorageFilter) != null;

            if (hasLowStorage) {
                Toast.makeText(this, R.string.low_storage_error, Toast.LENGTH_LONG).show();
                Log.w(TAG, getString(R.string.low_storage_error));
            }
        }

        // Creates and starts the camera.  Note that this uses a higher resolution in comparison
        // to other detection examples to enable the text recognizer to detect small pieces of text.
        cameraSource =
                new CameraSource.Builder(getApplicationContext(), textRecognizer)
                .setFacing(CameraSource.CAMERA_FACING_BACK)
                .setRequestedPreviewSize(1280, 1024)
                .setRequestedFps(2.0f)
                .setFlashMode(useFlash ? Camera.Parameters.FLASH_MODE_TORCH : null)
                .setFocusMode(autoFocus ? Camera.Parameters.FOCUS_MODE_CONTINUOUS_VIDEO : null)
                .build();

    }

    /**
     * Restarts the camera.
     */
    @SuppressLint("LongLogTag")
    @Override
    protected void onResume() {
        super.onResume();
        if (!OpenCVLoader.initDebug()) {
            Log.d("OpenCV", "Internal OpenCV library not found. Using OpenCV Manager for initialization");
            OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_3_0_0, this, mLoaderCallback);
        } else {
            Log.d("OpenCV", "OpenCV library found inside package. Using it!");
            mLoaderCallback.onManagerConnected(LoaderCallbackInterface.SUCCESS);
        }
        checkLocationPermission();
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 400, 1, this);
        Location loc = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        Log.d("LocationTest", " - "+loc+" - ");


        startCameraSource();

    }

    /**
     * Stops the camera.
     */
    @Override
    protected void onPause() {
        super.onPause();
        if (preview != null) {
            preview.stop();
        }
    }

    /**
     * Releases the resources associated with the camera source, the associated detectors, and the
     * rest of the processing pipeline.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (preview != null) {
            preview.release();
        }
    }

    /**
     * Callback for the result from requesting permissions. This method
     * is invoked for every call on {@link #requestPermissions(String[], int)}.
     * <p>
     * <strong>Note:</strong> It is possible that the permissions request interaction
     * with the user is interrupted. In this case you will receive empty permissions
     * and results arrays which should be treated as a cancellation.
     * </p>
     *
     * @param requestCode  The request code passed in {@link #requestPermissions(String[], int)}.
     * @param permissions  The requested permissions. Never null.
     * @param grantResults The grant results for the corresponding permissions
     *                     which is either {@link PackageManager#PERMISSION_GRANTED}
     *                     or {@link PackageManager#PERMISSION_DENIED}. Never null.
     * @see #requestPermissions(String[], int)
     */
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        switch (requestCode){
            case RC_HANDLE_CAMERA_PERM:

                if (grantResults.length != 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Log.d(TAG, "Camera permission granted - initialize the camera source");
                    // we have permission, so create the camerasource
                    boolean autoFocus = getIntent().getBooleanExtra(AutoFocus,true);
                    boolean useFlash = getIntent().getBooleanExtra(UseFlash, false);
                    createCameraSource(autoFocus, useFlash);
                }
                return;
            case RC_HANDLE_LOCATION_PERM:
                if (grantResults.length != 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Log.d(TAG, "Camera permission granted - initialize the camera source");
                    // we have permission, so create the camerasource
                    if (ContextCompat.checkSelfPermission(this,
                            Manifest.permission.ACCESS_FINE_LOCATION)
                            == PackageManager.PERMISSION_GRANTED) {

                        //Request location updates:
                        //String provider = "";
                        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 400, 1, this);
                    }

                }
                return;

        }
        DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Multitracker sample")
                .setMessage(R.string.no_camera_permission)
                .setPositiveButton(R.string.ok, listener)
                .show();
    }

    /**
     * Starts or restarts the camera source, if it exists.  If the camera source doesn't exist yet
     * (e.g., because onResume was called before the camera source was created), this will be called
     * again when the camera source is created.
     */
    @SuppressLint("LongLogTag")
    private void startCameraSource() throws SecurityException {
        // check that the device has play services available.
        int code = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(
                getApplicationContext());
        if (code != ConnectionResult.SUCCESS) {
            Dialog dlg =
                    GoogleApiAvailability.getInstance().getErrorDialog(this, code, RC_HANDLE_GMS);
            dlg.show();
        }

        if (cameraSource != null) {
            try {
                preview.start(cameraSource, graphicOverlay);
                //Log.d("TESTMAP", "Unable to start camera source. "+ cameraSource);
                //Bitmap image = preview.getBitmap();


            } catch (IOException e) {
                Log.e(TAG, "Unable to start camera source.", e);
                cameraSource.release();
                cameraSource = null;
            }
        }
    }

    /**
     * onTap is called to speak the tapped TextBlock, if any, out loud.
     *
     * @param rawX - the raw position of the tap
     * @param rawY - the raw position of the tap.
     * @return true if the tap was on a TextBlock
     */
    private boolean onTap(float rawX, float rawY) {
        OcrGraphic graphic = graphicOverlay.getGraphicAtLocation(rawX, rawY);
        TextBlock text = null;
        if (graphic != null) {
            text = graphic.getTextBlock();
            if (text != null && text.getValue() != null) {
                Log.d(TAG, "text data is being spoken! " + text.getValue());
                // Speak the string.
                tts.speak(text.getValue(), TextToSpeech.QUEUE_ADD, null, "DEFAULT");
            }
            else {
                Log.d(TAG, "text data is null");
            }
        }
        else {
            Log.d(TAG,"no text detected");
        }
        return text != null;
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    private class CaptureGestureListener extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            return onTap(e.getRawX(), e.getRawY()) || super.onSingleTapConfirmed(e);
        }
    }

    private class ScaleListener implements ScaleGestureDetector.OnScaleGestureListener {

        /**
         * Responds to scaling events for a gesture in progress.
         * Reported by pointer motion.
         *
         * @param detector The detector reporting the event - use this to
         *                 retrieve extended info about event state.
         * @return Whether or not the detector should consider this event
         * as handled. If an event was not handled, the detector
         * will continue to accumulate movement until an event is
         * handled. This can be useful if an application, for example,
         * only wants to update scaling factors if the change is
         * greater than 0.01.
         */
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            return false;
        }

        /**
         * Responds to the beginning of a scaling gesture. Reported by
         * new pointers going down.
         *
         * @param detector The detector reporting the event - use this to
         *                 retrieve extended info about event state.
         * @return Whether or not the detector should continue recognizing
         * this gesture. For example, if a gesture is beginning
         * with a focal point outside of a region where it makes
         * sense, onScaleBegin() may return false to ignore the
         * rest of the gesture.
         */
        @Override
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            return true;
        }

        /**
         * Responds to the end of a scale gesture. Reported by existing
         * pointers going up.
         * <p/>
         * Once a scale has ended, {@link ScaleGestureDetector#getFocusX()}
         * and {@link ScaleGestureDetector#getFocusY()} will return focal point
         * of the pointers remaining on the screen.
         *
         * @param detector The detector reporting the event - use this to
         *                 retrieve extended info about event state.
         */
        @Override
        public void onScaleEnd(ScaleGestureDetector detector) {
            if (cameraSource != null) {
                cameraSource.doZoom(detector.getScaleFactor());
            }
        }
    }
    private void showMyDialog(Context context) {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(true);

        TextView textView = (TextView) dialog.findViewById(R.id.txtTitle);
        TextView textAdress = (TextView) dialog.findViewById(R.id.adress);
        final TextView textCode = (TextView) dialog.findViewById(R.id.editText4);
        final TextView textDepartement = (TextView) dialog.findViewById(R.id.depart);
        final TextView textCommune = (TextView) dialog.findViewById(R.id.commune);
        final TextView textRegion = (TextView) dialog.findViewById(R.id.region);

        textCode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                //textRegion;
                //textCommune;
                //textDepartement;
            }
        });
        checkLocationPermission();
        locationManager.requestSingleUpdate(LocationManager.NETWORK_PROVIDER, OcrCaptureActivity.this, null);
        Location loc = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        if(user.getLocation()==null) {
            user.setLocation(loc);
        }

        Geocoder gCoder = new Geocoder(context);
        try {
            List<Address> addresses = gCoder.getFromLocation(loc.getLatitude(), loc.getLongitude(), 1);
            textAdress.setText(addresses.get(0).getFeatureName()+" "+addresses.get(0).getThoroughfare());
            textDepartement.setText(addresses.get(0).getSubAdminArea());
            textRegion.setText(addresses.get(0).getAdminArea());
            textCommune.setText(addresses.get(0).getLocality());
            textCode.setText(addresses.get(0).getPostalCode());
            Log.d("LocationTest", " Approx "+addresses);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Button btnBtmLeft = (Button) dialog.findViewById(R.id.btnBtmLeft);

        btnBtmLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    /*URL url = new URL(API_URL);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    con.setRequestMethod("GET");
                    con.connect();
                    JSONObject js  = JsonFetcher.urlToJson(url);
                    Log.e("Webinfo", (String) js.get("links"));
                    */
                    final TextView textView = (TextView) findViewById(R.id.text);

                    // Instantiate the RequestQueue.
                    RequestQueue queue = Volley.newRequestQueue(OcrCaptureActivity.this);
                    String url ="http://www.exemple.com";

                    // Request a string response from the provided URL.
                    String query = "";
                    try {
                        query= URLEncoder.encode(
                                "\""+textCommune.getText()+"\" " +
                                        "AND \""+textCode.getText()+"\" " +
                                        "AND \""+textDepartement.getText()+"\"" +
                                        "AND \""+textRegion.getText()+"\"","UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    StringRequest stringRequest = new StringRequest(Request.Method.GET, API_URL + query,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    // Display the first 500 characters of the response string.
                                    //textView.setText("Response is: "+ response.substring(0,500));
                                    Log.v("OnResponse", "Buen " + response.substring(0, 500));
                                    try {

                                        //JsonFetcher.responseToJson(response).get("links");
                                        Log.v("OnResponse", "Jsoned " + JsonFetcher.responseToJson(response).get("records"));
                                        JSONObject js = JsonFetcher.responseToJson(response);
                                        JSONArray ns = js.getJSONArray("records");
                                        JSONObject fields = ns.getJSONObject(0).getJSONObject("record").getJSONObject("fields");
                                        Log.v("OnResponse", "Jsoned " + fields.getString("insee_com"));
                                        //recherchePDL(null,null,null,truststore,keystore);
                                        //SoapTest.run2(truststore,keystore);
                                        //RecherchePointPortTypeClientAnd.test();

                                        InputStream stream = getResources().openRawResource(R.raw.truststorebksv1);
                                        InputStream stream2 = getResources().openRawResource(R.raw.keystorebksv1);

                                        KeyStore trustStore;
                                        KeyStore keyStore;

                                        try {

                                            trustStore = KeyStore.getInstance("BKS");
                                            keyStore = KeyStore.getInstance("BKS");

                                            trustStore.load(stream, "chenshuo".toCharArray());
                                            keyStore.load(stream2, "chenshuo".toCharArray());

                                            KeyManagerFactory kmfactory = KeyManagerFactory.getInstance(
                                                    KeyManagerFactory.getDefaultAlgorithm());

                                            kmfactory.init(keyStore, "chenshuo".toCharArray());

                                            TrustManagerFactory tmf=TrustManagerFactory
                                                    .getInstance(TrustManagerFactory.getDefaultAlgorithm());

                                            tmf.init(trustStore);

                                            SSLContext sslContext=SSLContext.getInstance("TLSv1.2");

                                            sslContext.init(kmfactory.getKeyManagers(), tmf.getTrustManagers(), new SecureRandom());

                                            SSLSocketFactory factory=sslContext.getSocketFactory();

                                            //sslContext.createSSLEngine();
                                            SSLConection.allowAllSSL();

                                            new AsyncSoap().execute(truststore,keystore);




                                        } catch (Exception e) {
                                            Log.e("ERROR", "message", e);

                                        }


                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        Log.e("Excepted", "Probleme " + e.getMessage());

                                    }

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            //textView.setText("That didn't work!");
                            Log.e("OnResponse", "Probleme " + error.getMessage());

                        }
                    });

                    // Add the request to the RequestQueue.
                    queue.add(stringRequest);

                    //System.out.println(js.get("links"));
                }catch (Exception e){
                    e.printStackTrace();
                    Log.e("Webinfo", "Probleme "+e.getMessage());

                }

                //dialog.dismiss();
            }
        });


        /**
         * if you want the dialog to be specific size, do the following
         * this will cover 85% of the screen (85% width and 85% height)
         */
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int dialogWidth = (int)(displayMetrics.widthPixels * 0.85);
        int dialogHeight = (int)(displayMetrics.heightPixels * 0.85);
        dialog.getWindow().setLayout(dialogWidth, dialogHeight);

        dialog.show();
    }
}
