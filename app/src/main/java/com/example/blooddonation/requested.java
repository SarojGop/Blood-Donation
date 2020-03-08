package com.example.blooddonation;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.blooddonation.Login.afterlogin;

public class requested extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.requestty);

        Button finishBtn = findViewById(R.id.button3);

        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), afterlogin.class);
                startActivity(startIntent);
            }
        });

    }
}

