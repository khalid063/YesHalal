package com.example.yeshalal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    // for Splash Screen
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        //S. for SplashScreen
        new Handler ().postDelayed (new Runnable () {
            @Override
            public void run() {
                Intent i = new Intent (MainActivity.this, HomeActivity.class);
                startActivity (i);
                finish ();
            }
        },SPLASH_TIME_OUT); //E. for SplashScreen


    }
}
