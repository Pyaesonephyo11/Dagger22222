package com.example.dagger22222.dagger;

import com.example.dagger22222.MainActivity;
import com.example.dagger22222.car.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class,PetroEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

  @Component.Builder
    interface Builder{

      @BindsInstance
      Builder horserPower(@Named("horse power") int horsePower);

      @BindsInstance
      Builder engineCapacity(@Named("engine capacity") int engineCapacity);

      CarComponent build();
  }
}
