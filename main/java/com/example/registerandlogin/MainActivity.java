package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.RelativeLayout;

import com.example.registerandlogin.data.model.LoggedInUser;

public class MainActivity extends AppCompatActivity {

    Button reg, log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reg = (Button)findViewById(R.id.button1);
        log = (Button)findViewById(R.id.button2);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(MainActivity.this,register.class);
                startActivity(register);
            }
        });


        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(MainActivity.this, activity_login.class);
                startActivity(login);
            }
        });

    }
}
