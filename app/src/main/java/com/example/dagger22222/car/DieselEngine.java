package com.example.dagger22222.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{

    private int horsepower;

    @Inject
    public DieselEngine(int horsepower){
        this.horsepower=horsepower;
    }

    @Override
    public void start() {
        Log.d("msg","Diesel Engine Started. Horsepower:"+horsepower);
    }
}
