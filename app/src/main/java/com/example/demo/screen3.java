package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class screen3 extends AppCompatActivity {

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        btnNext = findViewById(R.id.btnNext);


        Intent inext = new Intent(screen3.this, screen4.class);
        btnNext.setOnClickListener(view -> {
            startActivity(inext);
        });
    }
}