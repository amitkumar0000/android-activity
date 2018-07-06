package com.android.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.activitylifecycle.utils.Constants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Constants.TAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Constants.TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Constants.TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Constants.TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Constants.TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Constants.TAG,"onDestroy");
    }
}
