package com.example.presentation2022.Observer.pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherSensor {
    private List<WeatherObserver> subscriberList = new ArrayList<>();


    public void attach(WeatherObserver weatherObserver){
        this.subscriberList.add(weatherObserver);
        weatherObserver.setSensor(this);
    }
    public void dettachFromPushNotification(WeatherObserver weatherObserver){
        this.subscriberList.remove(weatherObserver);
    }

    public void notifyObservers(){
        subscriberList.forEach(x -> x.update(getState()));
    }
    abstract public double getState();
    abstract public void start();

}
