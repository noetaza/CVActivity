package com.example.noe.cvactivity;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("HelloWorld", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("HelloWorld", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("HelloWorld", "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("HelloWorld", "onDestroy");
    }
}
