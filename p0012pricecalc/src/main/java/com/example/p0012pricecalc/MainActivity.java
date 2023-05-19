package com.example.p0012pricecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TextView totalPrice;
    public CheckBox option_1, option_2, option_3, option_4, option_5;
    private Spinner cars_select;
    private Button calculatePriceButton;

    private Button SaveButton;

    private Button LoadButton;

    private String FILE_NAME = "content.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalPrice = findViewById(R.id.totalPrice);
        option_1 = findViewById(R.id.option_1);
        option_2 = findViewById(R.id.option_2);
        option_3 = findViewById(R.id.option_3);
        option_4 = findViewById(R.id.option_4);
        option_5 = findViewById(R.id.option_5);
        cars_select = findViewById(R.id.cars_select);
        calculatePriceButton = findViewById(R.id.calculatePriceButton);
        SaveButton = findViewById(R.id.SaveButton);
        LoadButton = findViewById(R.id.LoadButton);

        calculatePriceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float price;
                switch (cars_select.getSelectedItem().toString()){
                    case "Lada Granta":
                        price = 200000;
                        break;
                    case "Daewoo Nexia":
                        price = 400000;
                        break;
                    case "Chevrolet Lacetti":
                        price = 300000;
                        break;
                    case "Daewoo Matiz":
                        price = 100000;
                        break;
                    case "Kia Rio":
                        price = 500000;
                        break;
                    default:
                        price = -1;
                        break;
                }
                if (option_1.isChecked()){
                    price += 20000;
                }
                if (option_2.isChecked()){
                    price += 10000;
                }
                if (option_3.isChecked()){
                    price += 8000;
                }
                if (option_4.isChecked()){
                    price += 5000;
                }
                if (option_5.isChecked()){
                    price += 2000;
                }

                totalPrice.setText("Итоговая цена: " + String.valueOf(price));
            }
        });

        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FileOutputStream fos = null;
                try {
                    Boolean option_1_value = option_1.isChecked();
                    Boolean option_2_value = option_2.isChecked();
                    Boolean option_3_value = option_3.isChecked();
                    Boolean option_4_value = option_4.isChecked();
                    Boolean option_5_value = option_5.isChecked();
                    String totalPrice_value = totalPrice.getText().toString();
                    String car_value = cars_select.getSelectedItem().toString();
                    String text = option_1_value.toString() + ";" + option_2_value.toString() + ";" + option_3_value.toString() + ";" + option_4_value.toString() + ";" + option_5_value.toString() + ";" + totalPrice_value + ";" + car_value;
                    fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
                    fos.write(text.getBytes());
                    Toast.makeText(MainActivity.this, "Файл сохранен", Toast.LENGTH_SHORT).show();
                }
                catch(IOException ex) {
                    Toast.makeText(MainActivity.this, ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
                finally{
                    try{
                        if(fos!=null)
                            fos.close();
                    }
                    catch(IOException ex){
                        Toast.makeText(MainActivity.this, ex.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        LoadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FileInputStream fin = null;
                try {
                    fin = openFileInput(FILE_NAME);
                    byte[] bytes = new byte[fin.available()];
                    fin.read(bytes);
                    String text = new String (bytes);
                    String[] values = text.split(";");
                    totalPrice.setText(values[5]);
                    cars_select.setSelection(((ArrayAdapter)cars_select.getAdapter()).getPosition(values[6]));
                    if (Objects.equals(values[0], "true")){ option_1.setChecked(true); }
                    else{ option_1.setChecked(false); }
                    if (Objects.equals(values[1], "true")){ option_2.setChecked(true); }
                    else{ option_2.setChecked(false); }
                    if (Objects.equals(values[2], "true")){ option_3.setChecked(true); }
                    else{ option_3.setChecked(false); }
                    if (Objects.equals(values[3], "true")){ option_4.setChecked(true); }
                    else{ option_4.setChecked(false); }
                    if (Objects.equals(values[4], "true")){ option_5.setChecked(true); }
                    else{ option_5.setChecked(false); }
                }
                catch(IOException ex) {
                    Toast.makeText(MainActivity.this, ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
                finally{
                    try{
                        if(fin!=null)
                            fin.close();
                    }
                    catch(IOException ex){
                        Toast.makeText(MainActivity.this, ex.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
