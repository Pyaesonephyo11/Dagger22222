package com.example.dagger22222.dagger;

import com.example.dagger22222.car.Engine;
import com.example.dagger22222.car.PetroEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  abstract class PetroEngineModule {


    @Binds
    abstract Engine providePetroEngine(PetroEngine petroEngine);

}
