package com.example.triathlonregistration;

import androidx.annotation.Dimension;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultsActivity extends AppCompatActivity {
    final String TAG = "ConcertDemo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView txtViewResults = findViewById(R.id.txtViewResults);

        try{
             double cost = getIntent().getExtras().getDouble("COST",0);
         int numberOfAthletes = getIntent().getExtras().getInt("Number Of Athletes",0);
        String location = getIntent().getExtras().getString("TYPE");

            DecimalFormat df = new DecimalFormat("$#.##");
            String outputStr = "TYPE: " + location + "\n" + "Number of Athletes " + numberOfAthletes
                    + "\n" + "Total cost " + df.format(cost);

            txtViewResults.setText(outputStr);
            txtViewResults.setTextSize(Dimension.SP,24);
            txtViewResults.setGravity(Gravity.CENTER);

        }catch(Exception e){
            Log.d(TAG,e.getMessage());
        }
    }
}