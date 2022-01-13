package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    public void USDtoRupees (View view){
        EditText dollarAmount =(EditText) findViewById(R.id.dollarAmount);
        String dollar= dollarAmount.getText().toString();
        Double dollardouble= Double.parseDouble(dollar);
        Double doubleinr= 73.26*dollardouble;
        String answer= String.format("%.2f" ,doubleinr);
        Toast.makeText(this,"INR=" + answer, Toast.LENGTH_SHORT).show();
        Log.i("INFO","BUTTON PRESSED");
}
    public void EUROtoRupees (View view){
        EditText euroAmount =(EditText) findViewById(R.id.euroAmount);
        String euro= euroAmount.getText().toString();
        Double eurodouble= Double.parseDouble(euro);
        Double doubleinr= 89.02*eurodouble;
        String answer= String.format("%.2f" ,doubleinr);
        Toast.makeText(this,"INR=" + answer, Toast.LENGTH_SHORT).show();
        Log.i("INFO","BUTTON PRESSED");}







        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    }