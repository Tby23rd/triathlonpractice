package com.example.lec3concertdemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    final String TAG = "Concert Demo";
    //creates a final string to be used in the logs
    Spinner spinnerConcertType;
    private Object Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Starting app...");
        //just a test log msg put in the debug logs
        Button btnCalcCost = findViewById(R.id.btnCalculateCost);
        EditText editTextNamTix = findViewById(R.id.editTextNamTix);
        spinnerConcertType = findViewById(R.id.spinnerConcertType);

        
        btnCalcCost.setOnClickListener((View view) -> {
            if(editTextNamTix.getText().toString().equals(""))
            {
                Log.d(TAG, "Number of tickets is empty");//adding for programmer
                Toast.makeText(this, "Number of tickets cannot be empty", Toast.LENGTH_SHORT).show();
            //display a msg to the user
            }else{
                //when the edit text is nonempty
                try{
                    int numTix = Integer.parseInt(editTextNamTix.getText().toString());
                    int index = spinnerConcertType.getSelectedItemPosition();
                    double cost = 0;
                    switch(index){
                        case 0:
                            cost = numTix*79.99;
                            break;
                            case 1:
                                cost = numTix*69.99;
                                break;
                        case 2:
                            cost = numTix*59.99;
                            break;
                    }
                    //at this point the total cost is computed
                    //create an intent to start activity and start results activity
                 android.content.Intent myResults = new Intent(MainActivity.this,ResultsActivity.class);
                    
                    //create an intent object to start new activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("NUMTIX",numTix);
                    bundle.putString("TYPE",spinnerConcertType.getSelectedItem().toString());
                    bundle.putDouble("COST",cost);
                    //create a buncle object with all data
                    //put bundle object into the intent object
                    myResults.putExtras(bundle);
                    //start next activity
                   startActivity(myResults);

                }catch(Exception ex){

                }
            }
        });

    }
}