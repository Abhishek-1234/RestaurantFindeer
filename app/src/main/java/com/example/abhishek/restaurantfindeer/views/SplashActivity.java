package com.example.abhishek.restaurantfindeer.views;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.abhishek.restaurantfindeer.R;

/**
 * Created by ABHISHEK on 02-08-2017.
 */


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //to hide the action bar of splash screen.
        getSupportActionBar().hide();

        //to delay the transition from splash screen to home screen.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,HomeActivity.class));
                finish();
            }
        },3000);


    }
}

