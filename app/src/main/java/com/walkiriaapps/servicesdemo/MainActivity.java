package com.walkiriaapps.servicesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = new Intent(this, MyService.class);
        startService(i);

    }

    @Override
    protected void onStop() {
        super.onStop();
        stopService(i);
    }
}