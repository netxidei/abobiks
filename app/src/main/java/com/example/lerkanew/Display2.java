package com.example.lerkanew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Display2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display2);
    }
    public void gonext(View v){
        Intent intent = new Intent(this,Display3.class);
        startActivity(intent);
    }
}