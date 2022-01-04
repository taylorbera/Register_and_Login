package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

public class activity_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //run splash screen for 3secs
        //from https://abhiandroid.com/programming/splashscreen
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(activity_splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}