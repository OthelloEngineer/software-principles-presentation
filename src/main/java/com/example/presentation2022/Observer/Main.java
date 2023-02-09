package com.example.presentation2022.Observer;

import com.example.presentation2022.Observer.pattern.*;

public class Main {
    public static void main(String[] args) {
        WeatherSensor weatherSensor = new TemperatureSensor();

        WeatherObserver myInfoScreen = new InfoScreen();
        WeatherObserver myMobilePhone = new MobileSubscriber();

        weatherSensor.attach(myInfoScreen);
        weatherSensor.attach(myMobilePhone);
        while(true){
            weatherSensor.start();
        }

    }

}
