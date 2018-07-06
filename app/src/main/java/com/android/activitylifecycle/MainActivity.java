package com.android.activitylifecycle;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.android.activitylifecycle.utils.Constants;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Constants.TAG,"onCreate");
        textView = findViewById(R.id.textview);

        if(savedInstanceState!=null){
            count = savedInstanceState.getInt(Constants.COUNT);
            textView.setText(String.valueOf(count));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Constants.TAG,"onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(Constants.TAG, "onRestoreInstanceState");
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
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(Constants.COUNT, count);
        Log.d(Constants.TAG, "onSaveInstanceState");

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

    public void click(View view){
        textView.setText(String.valueOf(++count));
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
        Log.d(Constants.TAG,"onConfigurationChanged");

    }
}
