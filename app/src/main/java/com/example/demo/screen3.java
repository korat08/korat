package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class screen3 extends AppCompatActivity {

    Button btnNext;
    EditText firstname,lastname,phonenumber,email,age,city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        btnNext = findViewById(R.id.btnNext);
        firstname=findViewById(R.id.firstname);
        lastname=findViewById(R.id.lastname);
        phonenumber=findViewById(R.id.phonenumber);
        email=findViewById(R.id.email);
        age=findViewById(R.id.age);
        city=findViewById(R.id.city);

//        String getfirstname = firstname.getText().toString();
//        String getlastname = lastname.getText().toString();
//        String fullname=getfirstname+""+getlastname;


        Intent inext = new Intent(screen3.this, screen4.class);


        btnNext.setOnClickListener(view -> {

            String getfirstname = firstname.getText().toString();
            String getlastname = lastname.getText().toString();
            String fullname=getfirstname+" "+getlastname;

            String getfullname = fullname.toString();
            String getphone = phonenumber.getText().toString();
            String getemail = email.getText().toString();
            String getage = age.getText().toString();
            String getcity = city.getText().toString();

            inext.putExtra("flt",getfullname);
            inext.putExtra("pt",getphone);
            inext.putExtra("et",getemail);
            inext.putExtra("at",getage);
            inext.putExtra("ct",getcity);
            startActivity(inext);
        });
    }
}