package com.example.p0021classpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goCPUActivity(View v){
        Intent intent = new Intent(this, CPUActivity.class);
        startActivity(intent);
    }

    public void goGPUActivity(View v){
        Intent intent = new Intent(this, GPUActivity.class);
        startActivity(intent);
    }

    public void goRAMActivity(View v){
        Intent intent = new Intent(this, RAMActivity.class);
        startActivity(intent);
    }
}