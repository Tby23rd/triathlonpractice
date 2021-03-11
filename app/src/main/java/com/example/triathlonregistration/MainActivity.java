package com.example.triathlonregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String TAG = "Triathlon Registration";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Starting App..");

        Button btncomputecost = findViewById(R.id.btncomputecost);
        EditText editTextlocation = findViewById(R.id.editTextlocation);
        Spinner spinnerlocation = findViewById(R.id.spinnerlocation);

        btncomputecost.setOnClickListener((View view)->{

            if(editTextlocation.getText().toString().equals("")){

                Log.d(TAG,"Number of athletes is empty");

                Toast.makeText(this, "Number of athletes cannot be empty",
                        Toast.LENGTH_SHORT).show();
    } else {
          try{
                    int numberOfAthletes = Integer.parseInt(editTextlocation.getText().toString());
                    int index = spinnerlocation.getSelectedItemPosition() ;
                    double cost = numberOfAthletes *75;
                    /*
                    double cost = 0;
                    switch(index)
                    {
                        case 0:
                        cost = numberOfAthletes*10;
                        break;
                        case 1:
                            cost = numberOfAthletes*20;
                            break;
                        case 2:
                            cost = numberOfAthletes*30;
                            break;
                    }
                    */

              Intent myResults = new Intent(MainActivity.this,ResultsActivity.class);
                   Bundle bundle = new Bundle();
                   bundle.putInt("Number Of Athletes", numberOfAthletes);
                   bundle.putString("TYPE", spinnerlocation.getSelectedItem().toString());
                   bundle.putDouble("COST",cost);

                   myResults.putExtras(bundle);
                   startActivity(myResults);

                }
          catch(Exception e) {
                    Toast.makeText(this, "Please Check the input", Toast.LENGTH_SHORT).show();
                    Log.d(TAG,e.getMessage());
          }

            }
        });


    }
}