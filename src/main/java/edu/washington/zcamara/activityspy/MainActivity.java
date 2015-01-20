package edu.washington.zcamara.activityspy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity
{
    private static final String TAG = "MainActivity";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        logInfoEvent("Create");
    }
    @Override
    public void onStart() {
        super.onStart();
        logInfoEvent("Start");
    }
    @Override
    public void onResume() {
        super.onResume();
        logInfoEvent("Resume");
    }
    @Override
    public void onPause() {
        super.onPause();
        logInfoEvent("Pause");
    }
    @Override
    public void onStop() {
        super.onStop();
        logInfoEvent("Stop");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        logInfoEvent("Restart");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        logInfoEvent("Destroy");
        Log.e(TAG, "We're going down, Captain!");
    }
    private void logInfoEvent(String event) {
        Log.i(TAG, "on"+event+" event fired");
    }
}
