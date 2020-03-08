package com.example.blooddonation;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.blooddonation.Login.afterlogin;

public class blooddonate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blooddonor);
        Button donateBtn = findViewById(R.id.donate);
        Button cancelBtn = findViewById(R.id.request);
        donateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), thankyou.class);
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
