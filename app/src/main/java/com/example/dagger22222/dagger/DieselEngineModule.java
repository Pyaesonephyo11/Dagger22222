package com.example.dagger22222.dagger;

import com.example.dagger22222.car.DieselEngine;
import com.example.dagger22222.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {

    private int horsepower;
    public DieselEngineModule(int horsepower) {
        this.horsepower = horsepower;
    }

    @Provides
    int provideHorsePower(){
        return horsepower;
    }

    @Provides
    Engine provideDieselEngine(DieselEngine engine){
        return engine;
    }

}
