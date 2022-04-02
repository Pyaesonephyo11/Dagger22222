package com.example.dagger22222.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetroEngine implements Engine{

    int horsepower;
    int engineCapacity;

    @Inject
    public PetroEngine(@Named("horse power") int horsepower,
                       @Named("engine capacity") int engineCapacity){
        this.engineCapacity=engineCapacity;
        this.horsepower=horsepower;
    }
    @Override
    public void start() {
        Log.d("msg","Petro Engine Started.HorsePower is "+horsepower + "\nEngine Capacity is " +engineCapacity);
    }
}
