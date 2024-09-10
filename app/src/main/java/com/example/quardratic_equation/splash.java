package com.example.quardratic_equation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        Intent ilogo =new Intent(this, MainActivity.class);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(ilogo);
                finish();
            }
        },2000);

    }
}