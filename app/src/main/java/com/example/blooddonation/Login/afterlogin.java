package com.example.blooddonation.Login;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.blooddonation.R;
import com.example.blooddonation.blood_requester;
import com.example.blooddonation.blooddonate;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class afterlogin extends AppCompatActivity {
    private boolean isAuthListenerSet = false;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener = new FirebaseAuth.AuthStateListener() {
        @Override
        public void onAuthStateChanged( FirebaseAuth firebaseAuth) {
            FirebaseUser user = firebaseAuth.getCurrentUser();
            if (user != null) {
                //User is signed in
            } else {
                //User is signed out - insert your logic here
            }
        }
    };

    @Override
    protected void onStart() {
        super.onStart();
        if (!isAuthListenerSet) {
            FirebaseAuth.getInstance().addAuthStateListener(mAuthListener);
            isAuthListenerSet = true;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            FirebaseAuth.getInstance().removeAuthStateListener(mAuthListener);
            isAuthListenerSet = false;
        }
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterlogin);
        Button Donate = findViewById(R.id.Donate);
        Button request = findViewById(R.id.request);
        Button singout = findViewById(R.id.Exit);
        Donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), blooddonate.class);
                startActivity(startIntent);
            }
        });

        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), blood_requester.class);
                startActivity(startIntent);
            }
        });
        singout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent (afterlogin.this, LoginFragment.class);
                startActivity(i);
            }
        });
    }

}