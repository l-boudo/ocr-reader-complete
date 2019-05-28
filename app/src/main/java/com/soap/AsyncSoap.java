package com.soap;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.ksoap2.SoapFault;
import org.ksoap2.serialization.SoapObject;

public class AsyncSoap extends AsyncTask<String, String, String>
{

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }
    @Override
    protected String doInBackground(String... params) {
        try {
            SoapTest.run2(params[0],params[1]);
        } catch (Exception soapFault) {
            soapFault.printStackTrace();
            Log.e("ERROR",soapFault.getMessage());

        }
        return "Ok" ;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        if(result != null)
        {
            Log.d("DebugSOAP","Result");
        }
        else
        {

            //Toast.makeText(getApplicationContext(), "No Response", Toast.LENGTH_LONG).show();
        }
    }

}