package com.example.demo;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
public class screen5 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);

        Button done;
        done=findViewById(R.id.done);

        TextView showjob=findViewById(R.id.jobs);
//        TextView showexperience=findViewById(R.id.);

        String name=getIntent().getStringExtra("jobt");
        showjob.setText(name);


        Intent inext = new Intent(screen5.this, screen6.class);

        done.setOnClickListener(view -> {
            startActivity(inext);
        });
    }
}