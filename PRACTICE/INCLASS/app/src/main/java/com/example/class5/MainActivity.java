package com.example.class5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare the data inside this activity
        //can ultimately come from db or a file(less likely), shared preferences or other.
        ListView listViewSites = findViewById(R.id.listViewSites);
        //adapter determines how the data should be populated in the view
        ArrayAdapter<String> sitesArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,ChicagoSites);

        //setadapter on the lsitview
        listViewSites.setAdapter(sitesArrayAdapter);
        ListViewSites.setAdapter(mySitesAdapter);
    }
}