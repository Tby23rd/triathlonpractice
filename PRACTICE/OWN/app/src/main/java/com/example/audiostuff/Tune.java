package com.example.audiostuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Tune  {
String tuneName;
int tunePic;
int tuneRaw;

    public Tune(String tuneName) {
        this.tuneName = tuneName;
    }

    public String getTuneName() {
        return tuneName;
    }

    public void setTuneName(String tuneName) {
        this.tuneName = tuneName;
    }
}