package com.example.demo;

import static com.example.demo.MainActivity.showToast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class screen4 extends AppCompatActivity {

    EditText job, experience, education, language, skills, techanical;

    Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);



        create = findViewById(R.id.create);
        job = findViewById(R.id.job);
        experience = findViewById(R.id.experience);
        education = findViewById(R.id.education);
        language = findViewById(R.id.language);
        skills = findViewById(R.id.skills);
        techanical = findViewById(R.id.techanical);


        Intent inext = new Intent(screen4.this, screen5.class);

        create.setOnClickListener(view -> {

            String getfullname=getIntent().getStringExtra("flt");
            String getphone=getIntent().getStringExtra("pt");
            String getemail=getIntent().getStringExtra("et");
            String getage=getIntent().getStringExtra("at");
            String getcity=getIntent().getStringExtra("ct");

            String getjob = job.getText().toString();
            String getexperience = experience.getText().toString();
            String geteducation = education.getText().toString();
            String getlanguage = language.getText().toString();
            String getskills = skills.getText().toString();
            String gettechanical = techanical.getText().toString();

            showToast(getApplicationContext(),"Creating Resume");
            inext.putExtra("flt",getfullname);
            inext.putExtra("pt",getphone);
            inext.putExtra("et",getemail);
            inext.putExtra("at",getage);
            inext.putExtra("ct",getcity);
            inext.putExtra("jobt", getjob);
            inext.putExtra("ext", getexperience);
            inext.putExtra("edt", geteducation);
            inext.putExtra("lat", getlanguage);
            inext.putExtra("skt", getskills);
            inext.putExtra("techt", gettechanical);
            startActivity(inext);
        });
    }
}