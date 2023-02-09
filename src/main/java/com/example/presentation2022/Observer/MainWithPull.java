package com.example.presentation2022.Observer;

import com.example.presentation2022.Observer.pattern.*;

public class MainWithPull {
    public static void main(String[] args) {
        WeatherSensor weatherSensor = new TemperatureSensor();

        WeatherObserver myInfoScreen = new InfoScreen();
        WeatherObserver myMobilePhone = new MobileSubscriber();

        weatherSensor.attach(myInfoScreen);
        weatherSensor.attach(myMobilePhone);
        while(true){
            weatherSensor.start();
            weatherSensor.dettachFromPushNotification(myInfoScreen);
            pullMeasurement(weatherSensor, myInfoScreen);
        }

    }
    private static void pullMeasurement(WeatherSensor w, WeatherObserver o){
        Thread thread = new Thread(() -> {
            while (true) {
                o.update(w.getState());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
