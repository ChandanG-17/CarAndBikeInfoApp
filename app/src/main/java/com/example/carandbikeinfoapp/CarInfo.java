package com.example.carandbikeinfoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CarInfo extends AppCompatActivity {
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_info);
        btn = findViewById(R.id.BookNow);
        tv = findViewById(R.id.Display);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Car is Booked for you!!");
                Toast.makeText(CarInfo.this,"Congratulation you booked this Car",Toast.LENGTH_LONG).show();
            }
        });
    }
}