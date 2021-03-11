package com.example.audiostuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<String> tuneListNames = new ArrayList<>(Arrays.asList("Bag  pipes", "ukelele","Drums"));
    List<Integer> tuneListPics = new ArrayList<>(Arrays.asList
            (R.drawable.bagpipes, R.drawable.ukulele, R.drawable.drums));
    List<Integer> tuneListPRaws = new ArrayList<>(Arrays.asList
            (R.raw.bagpipes, R.raw.ukulele, R.raw.drums));

    List<Tune> tuneList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}