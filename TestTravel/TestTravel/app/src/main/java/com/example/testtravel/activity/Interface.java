package com.example.testtravel.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.testtravel.R;

public class Interface extends AppCompatActivity {

    private int loading=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent unpam = new Intent( Interface.this, LoginActivity.class);
                startActivity(unpam);
                finish();
            }
        },loading);
    }
}