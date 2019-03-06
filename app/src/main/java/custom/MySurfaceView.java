package custom;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;

public class MySurfaceView extends SurfaceView {

    public MySurfaceView(Context context) {
        super(context);
    }

    public MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MySurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MySurfaceView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public Bitmap getBitmap() {
        setDrawingCacheEnabled(true);
        buildDrawingCache();
        measure(MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED),
                MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        Log.d("BitmapLog", String.valueOf(getMeasuredHeight()));
        final Bitmap bitmap = Bitmap.createBitmap( getDrawingCache() );
        Log.d("BitmapLog", String.valueOf(bitmap));
        setDrawingCacheEnabled(false);
        destroyDrawingCache();
        return bitmap;
    }
}
