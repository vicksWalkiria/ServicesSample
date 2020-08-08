package com.walkiriaapps.servicesdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;


public class MyService extends Service {
    long startTime;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("WALKIRIA", "STARTING TIME IN APP");
        startTime = System.currentTimeMillis();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("WALKIRIA", "TOTAL TIME IN APP: "+(System.currentTimeMillis() - startTime));
    }
}
