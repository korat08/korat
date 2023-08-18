package com.example.demo;

import static com.example.demo.MainActivity.showToast;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class screen2 extends AppCompatActivity {


    MaterialButton login;

    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        login = findViewById(R.id.login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        Intent inext = new Intent(screen2.this, screen3.class);

        login.setOnClickListener(View -> {

            String email1 = email.getText().toString();
            String pass1 = password.getText().toString();

//            if (email1.endsWith("@gmail.com")) {
//                if (pass1.length() >= 6) {
                    startActivity(inext);
//                } else {
                    showToast(getApplicationContext(), "Password must be at least 6 characters");
//                }
//            } else {
//
//                showToast(getApplicationContext(), "invalid Gmail address");
//            }
        });
    }
}