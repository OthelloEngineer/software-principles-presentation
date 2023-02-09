package com.example.presentation2022.Observer.pattern;

import java.util.Random;

public class TemperatureSensor extends WeatherSensor {
    private double state;

    @Override
    public double getState() {
        return  this.state;
    }

    @Override
    public void start() {
        measuring();
        this.state = new Random().nextDouble()*10;
        notifyObservers();
    }

    private void measuring(){
        try {
            System.out.print("Censor: " + this.hashCode() + " measuring");
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
