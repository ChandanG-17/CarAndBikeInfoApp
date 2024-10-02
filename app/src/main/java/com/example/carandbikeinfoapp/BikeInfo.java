package com.example.carandbikeinfoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class BikeInfo extends AppCompatActivity {
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_info);
     btn = findViewById(R.id.BookNow);
     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            tv.setText("Bike is Booked for you!!");
             Toast.makeText(BikeInfo.this,"Congratulation you booked this Bike",Toast.LENGTH_LONG).show();
         }
     });
    }
}