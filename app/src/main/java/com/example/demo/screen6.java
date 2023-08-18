package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class screen6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6);

        EditText ln;
        TextView showeflname=findViewById(R.id.ln);

        String n1=getIntent().getStringExtra("flt");
        showeflname.setText(n1);
    }
}