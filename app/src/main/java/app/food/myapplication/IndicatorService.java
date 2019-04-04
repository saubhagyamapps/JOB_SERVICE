package app.food.myapplication;


import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

public final class IndicatorService extends Service {


    final private Handler mHandler = new Handler();

    private final Runnable mHandlerRunnable = new Runnable() {
        @Override
        public void run() {
            Toast.makeText(IndicatorService.this, "fafasdfsf", Toast.LENGTH_SHORT).show();

            mHandler.postDelayed(this, 1000);
        }
    };


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();

    }

    public void onCreate() {
        super.onCreate();


    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mHandler.removeCallbacks(mHandlerRunnable);
        mHandler.post(mHandlerRunnable);
        Toast.makeText(IndicatorService.this, "Testinggggggggggggg", Toast.LENGTH_SHORT).show();
        return START_REDELIVER_INTENT;
    }


}
