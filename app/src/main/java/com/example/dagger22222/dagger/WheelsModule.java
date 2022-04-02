package com.example.dagger22222.dagger;

import com.example.dagger22222.car.Rims;
import com.example.dagger22222.car.Tires;
import com.example.dagger22222.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
   static Rims provideRims(){
        Rims rims=new Rims();
        rims.doIt();
        return rims;
    }

    @Provides
    static Tires provideTiers(){
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }
    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
