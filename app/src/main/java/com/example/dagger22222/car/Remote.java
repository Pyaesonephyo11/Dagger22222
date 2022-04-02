package com.example.dagger22222.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote(){

    }
    public void setListener(Car car){
        Log.d("msg","Remote Connect");
    }
}
