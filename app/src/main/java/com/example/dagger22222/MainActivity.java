package com.example.dagger22222;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger22222.car.Car;
import com.example.dagger22222.dagger.CarComponent;
import com.example.dagger22222.dagger.DaggerCarComponent;
import com.example.dagger22222.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component= DaggerCarComponent.builder()
                .horserPower(2500)
                .engineCapacity(5000)
                .build();
        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
