package com.example.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.blooddonation.Login.afterlogin;

public class blood_requester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_requester);

        Button requestBtn = findViewById(R.id.request);
        Button cancelBtn = findViewById(R.id.cancel_button);
        requestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), requested.class);
                startActivity(startIntent);
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent endIntent = new Intent(getApplicationContext(), afterlogin.class);
                startActivity(endIntent);
            }
        });



    }
}
