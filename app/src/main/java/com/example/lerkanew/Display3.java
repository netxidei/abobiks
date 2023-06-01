package com.example.lerkanew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Display3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display3);
    }

    public void gonext4(View v) {
        Intent intent = new Intent(this, Display4.class);
        startActivity(intent);
    }
}