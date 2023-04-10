package com.example.p0021classpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GPUActivity extends AppCompatActivity {
    private final GPU[] GPUArr = new GPU[] {new GPU ("NVIDIA GeForce GTX 1660 Ti", "GPU", 296, 6, 1500),
                                            new GPU ("Intel Arc A770", "GPU", 487, 16, 2400),
                                            new GPU ("AMD Radeon RX 590", "GPU", 184, 8, 1469),
                                            new GPU ("NVIDIA GeForce RTX 4090", "GPU", 2318, 24, 2520),
                                            new GPU ("Intel Arc A380", "GPU", 153, 6, 2000),
                                            new GPU ("AMD Radeon RX 5500", "GPU", 352, 4, 1845)};
    ArrayAdapter<GPU> adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpuactivity);

        listView = findViewById(R.id.GPUList);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, GPUArr);
        listView.setAdapter(adapter);
    }

    public void goMainActivity(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}