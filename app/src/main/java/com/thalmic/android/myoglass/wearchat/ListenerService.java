package com.thalmic.android.myoglass.wearchat;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.Toast;

import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;
import com.thalmic.android.myoglass.GlassDevice;
import com.thalmic.android.myoglass.MyoRemoteService;

public class ListenerService extends WearableListenerService {

    private static final String SINGLE = "SINGLE";
    private static final String DOUBLE = "DOUBLE";
    private static final String DOWN = "DOUBLE";
    private static final String RTL = "RTL";
    private static final String LTR = "LTR";
    private static final String LONG_PRESS = "LONG";
    private static final String SHAKE = "SHAKE";
    private static final String ROTATION = "ROTATION";

    private MyoRemoteService mService;
    private GlassDevice mGlass;


    @Override
    public void onMessageReceived(MessageEvent messageEvent) {

        if (messageEvent.getPath().equals(SINGLE)) {
            //showToast(messageEvent.getPath());
            broadcastLocally(SINGLE);
        }

        if (messageEvent.getPath().equals(DOUBLE)) {
            //showToast(messageEvent.getPath());
            broadcastLocally(messageEvent.getPath());

        }

        if (messageEvent.getPath().equals(DOWN)) {
            //showToast(messageEvent.getPath());
            broadcastLocally(messageEvent.getPath());
        }

        if (messageEvent.getPath().equals(LONG_PRESS)) {
            //showToast(messageEvent.getPath());
            broadcastLocally(messageEvent.getPath());
        }

        if (messageEvent.getPath().equals(LTR)) {
            //showToast(messageEvent.getPath());
            broadcastLocally(messageEvent.getPath());
        }

        if (messageEvent.getPath().equals(SHAKE)) {
            //showToast(messageEvent.getPath());
            broadcastLocally(messageEvent.getPath());
        }

        if (messageEvent.getPath().equals(ROTATION)) {
            //showToast(messageEvent.getPath());
            broadcastLocally(messageEvent.getPath());
        }

        if (messageEvent.getPath().equals(RTL)) {
            //showToast(messageEvent.getPath());
            broadcastLocally(messageEvent.getPath());
//            Intent startIntent = new Intent(this, Msg5Activity.class);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(startIntent);
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    private void broadcastLocally(String message) {
        Intent intent = new Intent("gesture_wear");
        intent.putExtra("gesture", message);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }
}