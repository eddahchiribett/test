package com.chiri.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
      EditText FirstName, LastName,Email;
      Button Proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstName = findViewById(R.id.erFirstName);
        LastName = findViewById(R.id.erLastName);
        Email = findViewById(R.id.erEmail);
        Proceed = findViewById(R.id.ntShowInput);

        Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  firstName = FirstName.getText().toString();
                String  lastName = LastName.getText().toString();
                String  email = Email.getText().toString();

                Intent intent = new Intent( MainActivity.this, Homepage.class);
                intent.putExtra("K" ,firstName );
                intent.putExtra("LastName", lastName);
                intent.putExtra("Email", email);
                startActivity(intent);




            }
        });
    }
}
