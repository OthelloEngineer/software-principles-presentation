package com.example.presentation2022.Observer.pattern;

public class MobileSubscriber extends WeatherObserver {
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";
    @Override
    public void update(Double temp) {
        if (temp <= 5) {
            System.out.println("Mobile: " + this.hashCode() + " updated!");
            System.out.println("new state: " + temp);
            return;
        }
        System.out.println("Mobile: " + this.hashCode() + " updated!");
        System.out.println(ANSI_RED + "new state: " + temp + ANSI_RESET + " Drink some water!");
    }
}
