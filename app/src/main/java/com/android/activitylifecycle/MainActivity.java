package com.android.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.android.activitylifecycle.uidesign.Activity_A;
import com.android.activitylifecycle.utils.Constants;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    TextView textView;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
        textView = findViewById(R.id.textview);

        if(savedInstanceState!=null){
            count = savedInstanceState.getInt(Constants.COUNT);
            textView.setText(String.valueOf(count));
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(Constants.COUNT, count);
        Log.d(TAG, "onSaveInstanceState");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    public void click(View view){
        switch (view.getId()){
            case R.id.button:{
                textView.setText(String.valueOf(++count));
                break;
            }
            case R.id.button1:{
                startActivityForResult(new Intent(this, Activity_A.class),
                        Constants.ACTIVITY_A_REQUEST_CODE);
                break;
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG,"onActivityResult requestCode:: "+requestCode);
        switch (resultCode){
            case Constants.ACTIVITY_A_OK:{
                Log.d(TAG,"ACTIVITY_A_OK returns");
                break;
            }
        }
    }

    /*
        Configuration changed can be handled by app by mentioning
                    android:configChanges="keyboardHidden|orientation" in
                    activity manifest.
                    There is list of parameter which trigger config changes :
                    "navigation", "orientation"	,mcc,"mnc"	,"screenLayout"
                    "screenSize"	"touchscreen"	"uiMode"

         */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG,"onConfigurationChanged");

    }
}
