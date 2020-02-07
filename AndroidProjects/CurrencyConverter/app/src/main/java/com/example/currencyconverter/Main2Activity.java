package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = findViewById(R.id.conversion);
        Intent intent = getIntent();
        Double str = intent.getDoubleExtra("message",0);
        textView2.setText("Your total amount is " + str*0.77 + " pounds!");
    }
}
