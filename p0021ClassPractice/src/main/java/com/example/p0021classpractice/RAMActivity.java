package com.example.p0021classpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RAMActivity extends AppCompatActivity {
    private final RAM[] RAMArr = new RAM[] {new RAM ("Corsair Vengeance LPX (2x8GB)", "RAM", 119.93, 16, 3000),
                                            new RAM ("HyperX Fury (2x8GB)", "RAM", 139.96, 16, 2666),
                                            new RAM ("G.SKILL Trident Z RGB (2x16GB)", "RAM", 166.08, 32, 3200),
                                            new RAM ("Thermaltake TOUGHRAM RGB (2x8GB)", "RAM", 205.99, 16, 4400),
                                            new RAM ("Crucial CT8G4DFS824A (1x8GB)", "RAM", 51.72, 8, 2400),
                                            new RAM ("Patriot Memory VIPER 4 (2x8GB)", "RAM", 109, 16, 3200)};
    ArrayAdapter<RAM> adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramactivity);

        listView = findViewById(R.id.RAMList);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, RAMArr);
        listView.setAdapter(adapter);
    }

    public void goMainActivity(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}