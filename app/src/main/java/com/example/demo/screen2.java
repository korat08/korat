package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        MaterialButton login;
        login=findViewById(R.id.login);

        EditText email,password;
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View View) {

                String email1= email.getText().toString();
                String pass1=password.getText().toString();

                if (email1.endsWith("@gmail.com")) {
                    if(pass1.length()>=6){
                        Intent inext;
                        inext=new Intent(screen2.this, screen3.class);
                        startActivity(inext);
                        }else{
                        Toast.makeText(screen2.this, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(screen2.this, "invalid Gmail address", Toast.LENGTH_SHORT).show();
                    }
                }
        });
    }
}