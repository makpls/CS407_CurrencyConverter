package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText textbox = findViewById(R.id.textbox);
        double str = parseDouble(textbox.getText().toString());
        goToActivity2(str);
    }

    public void goToActivity2(double s){
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
