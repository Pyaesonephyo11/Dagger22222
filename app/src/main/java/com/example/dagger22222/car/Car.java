package com.example.dagger22222.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Driver driver;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels,Driver driver) {
        this.driver=driver;
        this.wheels = wheels;
        this.engine=engine;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d("msg",driver+"DRIVE"+this);
    }
}
