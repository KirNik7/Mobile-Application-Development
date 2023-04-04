package com.example.p0012pricecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView totalPrice;
    private CheckBox option_1, option_2, option_3, option_4, option_5;
    private Spinner cars_select;
    private Button calculatePriceButton;

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
    }
}
