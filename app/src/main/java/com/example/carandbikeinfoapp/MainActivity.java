package com.example.carandbikeinfoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    RadioButton Car, Bike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = findViewById(R.id.getinfo);
        Car = findViewById(R.id.car);
        Bike = findViewById(R.id.bike);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Car.isChecked()){
                  Intent intent = new Intent(MainActivity.this,CarInfo.class);
                  startActivity(intent);
                }
                else if(Bike.isChecked()){
                    Intent intent = new Intent(MainActivity.this,BikeInfo.class);
                    startActivity(intent);
                }
            }
        });
    }
}