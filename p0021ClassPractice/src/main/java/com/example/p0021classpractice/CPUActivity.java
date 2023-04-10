package com.example.p0021classpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CPUActivity extends AppCompatActivity {
    private final CPU[] CPUArr = new CPU[] {new CPU ("Intel Core i7 12700E", "CPU", 378, 12, 2.1),
                                            new CPU ("AMD Ryzen 5 7600X", "CPU", 242, 6, 4.7),
                                            new CPU ("Intel Core i3 13100F", "CPU", 120, 4, 3.4),
                                            new CPU ("AMD Ryzen 7 5800X", "CPU", 349, 8, 3.8),
                                            new CPU ("Intel Core i9 10940X", "CPU", 723, 14, 3.3),
                                            new CPU ("AMD Ryzen Threadripper PRO 5995WX", "CPU", 6499, 64, 2.7)};
    ArrayAdapter<CPU> adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpuactivity);

        listView = findViewById(R.id.CPUList);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, CPUArr);
        listView.setAdapter(adapter);
    }

    public void goMainActivity(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}