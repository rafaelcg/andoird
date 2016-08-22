package com.example.rafael.intentbasics;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Rafael on 14/06/2016.
 */
public class MeuIntentService extends IntentService {

    private static final String TAG = "com.example.rafael.intentbasics";

    public MeuIntentService(){
        super("MeuIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "The service has now started.");
    }
}
