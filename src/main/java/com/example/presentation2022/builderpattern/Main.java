package com.example.presentation2022.builderpattern;

import com.example.presentation2022.builderpattern.sandwich.BagelBuilder;
import com.example.presentation2022.builderpattern.sandwich.Sandwich;
import com.example.presentation2022.builderpattern.sandwich.SandwichBuilder;
import com.example.presentation2022.builderpattern.sandwich.toppings.Condiments;
import com.example.presentation2022.builderpattern.sandwich.toppings.Dressing;
import com.example.presentation2022.builderpattern.sandwich.toppings.Meat;
import com.example.presentation2022.builderpattern.sandwich.toppings.Veggies;

import java.io.LineNumberReader;

public class Main {
    public static void main(String[] args) {
        HavAJavaWorker sandwichWorker = new HavAJavaWorker();


        SandwichBuilder builder = new SandwichBuilder();
        BagelBuilder bagelBuilder = new BagelBuilder();

        sandwichWorker.createSalmonSandwich(builder);
        System.out.println(builder.build());

        sandwichWorker.createPickledSandwich(builder);
        System.out.println(builder.build());

        sandwichWorker.createSalmonSandwich(bagelBuilder);
        bagelBuilder.setHoleWidth(10);
        System.out.println(bagelBuilder.build());

        sandwichWorker.createOrderedSandwich(bagelBuilder);
        bagelBuilder.setHoleWidth(15);
        System.out.println(bagelBuilder.build());
    }
}

