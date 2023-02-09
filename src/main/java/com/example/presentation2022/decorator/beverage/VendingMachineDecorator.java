package com.example.presentation2022.decorator.beverage;

//courtesy to https://stackoverflow.com/a/37504043
public class VendingMachineDecorator {
    public static void main(String[] args) {
        Beverage beverage = new SugarDecorator
                (new LemonDecorator(
                new SugarDecorator (
                        new SugarDecorator(
                        new Tea("Assam Tea")))));
        beverage.decorateBeverage();
        beverage = new SugarDecorator(new LemonDecorator(new Coffee("Cappuccino")));
        beverage.decorateBeverage();
    }
}