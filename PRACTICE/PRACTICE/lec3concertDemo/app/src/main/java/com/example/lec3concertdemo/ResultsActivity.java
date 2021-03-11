package com.example.lec3concertdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    final String TAG = "Concert Demo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView textView = findViewById(R.id.textView);

        try{
            double cost = getIntent().getExtras().getDouble("COST", 0);
            int numTix = getIntent().getExtras().getInt("NUMTIX",0);
            String concertType =  getIntent().getExtras().getString("TYPE");

            //LOKUP decimalformat in java and how to convert cost as a currency

        }catch(Exception ex) {
            Log.d(TAG, ex.getMessage());//displays as log msg the exceptions object message
        }
    }
}