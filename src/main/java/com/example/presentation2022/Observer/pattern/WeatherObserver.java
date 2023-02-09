package com.example.presentation2022.Observer.pattern;

public abstract class WeatherObserver {
    WeatherSensor weatherSensor;

    abstract public void update(Double temp);

    public void setSensor(WeatherSensor weatherSensor){
        this.weatherSensor = weatherSensor;
    }
}
