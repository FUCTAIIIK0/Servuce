package com.example.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;


public class MyService extends Service {
    private String TAG ="Service";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: ");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "onUnbind: ");
        return super.onUnbind(intent);
        
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: MyService");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind: ");
        return null;
    }
}
