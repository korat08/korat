package com.example.demo;

import static android.os.Build.VERSION_CODES.S;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class screen4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        Button create;
        create=findViewById(R.id.create);

        EditText job,experience,education,language,skills,techanical;
        job=findViewById(R.id.job);
        experience=findViewById(R.id.experience);
        education=findViewById(R.id.education);
        language=findViewById(R.id.language);
        skills=findViewById(R.id.skills);
        techanical = findViewById(R.id.techanical);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getjob=job.getText().toString();
                String getexperience=experience.getText().toString();
                String geteducation=education.getText().toString();
                String getlanguage=language.getText().toString();
                String getskills=skills.getText().toString();
                String gettechanical=techanical.getText().toString();

                Intent inext;
                inext=new Intent(screen4.this, screen5.class);
                inext.putExtra("jobt",getjob);
                inext.putExtra("experiencet",getexperience);
                inext.putExtra("educationt",geteducation);
                inext.putExtra("languaget",getlanguage);
                inext.putExtra("skillst",getskills);
                inext.putExtra("technicalt",gettechanical);
                startActivity(inext);
            }
        });
    }
}