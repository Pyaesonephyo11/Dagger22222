package com.example.dagger22222.car;

import javax.inject.Inject;

public class Wheels {

    private Rims rims;
    private Tires tires;

    @Inject
    public Wheels(Rims rims,Tires tires){
       this.rims=rims;
       this.tires=tires;
    }
}
