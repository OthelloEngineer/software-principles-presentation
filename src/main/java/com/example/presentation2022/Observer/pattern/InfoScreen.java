package com.example.presentation2022.Observer.pattern;

public class InfoScreen extends WeatherObserver {

    @Override
    public void update(Double temp) {
        System.out.println("InfoScreen: " + this.hashCode() + " updated!");
        System.out.println("new state: " + temp);
    }
}
