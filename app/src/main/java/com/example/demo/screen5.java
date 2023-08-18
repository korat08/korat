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


        TextView showeflname=findViewById(R.id.fullname);
        TextView showpnum=findViewById(R.id.phones);
        TextView showemail=findViewById(R.id.emails);
        TextView showeage=findViewById(R.id.ages);
        TextView showecity=findViewById(R.id.citys);
        TextView showjob=findViewById(R.id.jobs);
        TextView showexperience=findViewById(R.id.experiences);
        TextView showeedu=findViewById(R.id.educations);
        TextView showeskills=findViewById(R.id.skillss);
        TextView showetech=findViewById(R.id.skillss);
        TextView showelan=findViewById(R.id.languages);

        String n1=getIntent().getStringExtra("flt");
        showeflname.setText(n1);

        String n2=getIntent().getStringExtra("et");
        showemail.setText(n2);

        String n3=getIntent().getStringExtra("pt");
        showpnum.setText(n3);

        String n4=getIntent().getStringExtra("at");
        showeage.setText(n4);

        String n5=getIntent().getStringExtra("ct");
        showecity.setText(n5);

        String n6=getIntent().getStringExtra("jobt");
        showjob.setText(n6);

        String n7=getIntent().getStringExtra("ext");
        showexperience.setText(n7);

        String n8=getIntent().getStringExtra("edt");
        showeedu.setText(n8);

        String n9=getIntent().getStringExtra("skt");
        showeskills.setText(n9);

        String n10=getIntent().getStringExtra("lat");
        showelan.setText(n10);

        Intent inext = new Intent(screen5.this, screen6.class);

        done.setOnClickListener(view -> {
            startActivity(inext);
        });
    }
}