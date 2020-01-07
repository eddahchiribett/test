package com.chiri.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {
     TextView FirstName,LastName, Email;
     String firstaName, lastName, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        FirstName = findViewById(R.id.irFirstName);
        LastName = findViewById(R.id.irLastName);
        Email = findViewById(R.id.irEmail);

        Intent intent = getIntent();
        if (intent.hasExtra("FirstName") || intent.hasExtra("LastName") || intent.hasExtra("Email")){
            firstaName = intent.getStringExtra("FirstName");
            lastName = intent.getStringExtra("LastName");
            email = intent.getStringExtra("Email");
        } else {
            Toast.makeText(this, "Nothing sent", Toast.LENGTH_SHORT).show();
        }

        FirstName.setText(firstaName);
        LastName.setText(lastName);
        Email.setText(email);
    }
}
