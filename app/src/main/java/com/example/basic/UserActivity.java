package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {
    TextView uEmail, uPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        uEmail = findViewById(R.id.uEmail);
        uPass =findViewById(R.id.uPass);

        Intent itent = getIntent();

        String EMAIL = itent.getStringExtra("email_key");
        uEmail.setText(EMAIL);
        String PASS = itent.getStringExtra("pass_key");
        uPass.setText(PASS);

    }
}