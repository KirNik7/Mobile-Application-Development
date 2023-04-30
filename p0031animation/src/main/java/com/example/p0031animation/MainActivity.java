package com.example.p0031animation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView sunImageView = findViewById(R.id.sun);
        ImageView line1ImageView = findViewById(R.id.line_1);
        ImageView line2ImageView = findViewById(R.id.line_2);
        ImageView line3ImageView = findViewById(R.id.line_3);
        ImageView line4ImageView = findViewById(R.id.line_4);
        ImageView carImageView = findViewById(R.id.car);

        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        Animation lineAnimation = AnimationUtils.loadAnimation(this, R.anim.lines_anim);
        Animation carAnimation = AnimationUtils.loadAnimation(this, R.anim.car_anim);

        sunImageView.startAnimation(sunRiseAnimation);
        line1ImageView.startAnimation(lineAnimation);
        line2ImageView.startAnimation(lineAnimation);
        line3ImageView.startAnimation(lineAnimation);
        line4ImageView.startAnimation(lineAnimation);
        carImageView.startAnimation(carAnimation);
    }
}