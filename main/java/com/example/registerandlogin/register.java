package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button regButton = findViewById(R.id.RegButton);

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = 0;
                String firstName = ((EditText) findViewById(R.id.firstname)).getText().toString();
                String lastName = ((EditText) findViewById(R.id.lastname)).getText().toString();
                String pass = ((EditText) findViewById(R.id.password)).getText().toString();
                String email = ((EditText) findViewById(R.id.email)).getText().toString();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";  // https://www.tutorialspoint.com/how-to-check-email-address-validation-in-android-on-edit-text

                //check if field is empty
                if (TextUtils.isEmpty(firstName) || (firstName.length() < 3 || firstName.length() > 30)) {
                    ((EditText) findViewById(R.id.firstname)).setError("Invalid");
                }
                else{
                    i++;}

                //check if field is empty
                if (TextUtils.isEmpty(lastName)) {
                    ((EditText) findViewById(R.id.lastname)).setError("EMPTY");
                }
                else{
                    i++;}

                //check if field is empty
                if (TextUtils.isEmpty(pass)) {
                    ((EditText) findViewById(R.id.password)).setError("EMPTY");
                }
                else{
                    i++;}

                //check if field is empty/check that email is valid
                if (TextUtils.isEmpty(email) || (!email.matches(emailPattern))){
                    ((EditText) findViewById(R.id.email)).setError("Invalid");
                }
                else{
                    i++;}

                if(i==4) {
                    Intent home = new Intent(register.this, MainActivity.class);
                    startActivity(home);
                }
            }

        });
    }
}
