package com.het.magit8_ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgBall = findViewById(R.id.img_8Ball);
        Button askButton = findViewById(R.id.btn_ask);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        askButton.setOnClickListener(view -> {
            Random randomNumberGenerator = new Random();
            int number = randomNumberGenerator.nextInt(5);
            imgBall.setImageResource(ballArray[number]);
        });

    }
}