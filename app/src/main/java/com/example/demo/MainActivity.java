package com.example.demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static void showToast(Context con, String message) {
        Toast.makeText(con, message, Toast.LENGTH_SHORT).show();
    }


    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start);


        Intent inext = new Intent(MainActivity.this, screen2.class);

        start.setOnClickListener(view -> {

            startActivity(inext);
        });
    }
}