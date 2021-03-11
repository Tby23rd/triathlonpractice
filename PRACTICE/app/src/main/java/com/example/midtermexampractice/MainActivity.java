package com.example.midtermexampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create an intent to start a second activity

       // Intent aboutRollsRoyce = new Intent(MainActivity.this, AboutRollsRoce.class);

        //create a bundle into the intent
      //  Bundle bundle = new Bundle();

        //put bundle object into intent object then start next activity

//startActivity(aboutRollsRoyce);
    }
}