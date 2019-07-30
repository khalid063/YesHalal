package com.example.yeshalal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.yeshalal.Fragments.ScanFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_home);

        // For changing the fragment
        getSupportFragmentManager ().beginTransaction ().replace (R.id.fragment_container, new ScanFragment ()).commit ();


    }
}
