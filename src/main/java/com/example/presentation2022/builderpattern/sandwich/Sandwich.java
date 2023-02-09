package com.example.presentation2022.builderpattern.sandwich;

import com.example.presentation2022.builderpattern.sandwich.toppings.Condiments;
import com.example.presentation2022.builderpattern.sandwich.toppings.Dressing;
import com.example.presentation2022.builderpattern.sandwich.toppings.Meat;
import com.example.presentation2022.builderpattern.sandwich.toppings.Veggies;

/**
 * Instance variables consists of type Object for demonstrating compositional flexibility of class instead of using String.
 */
public class Sandwich {
    public boolean isVegetarian;
    int size;
    Condiments condiments;
    Dressing dressing;
    Meat meat;
    Veggies veggies;
    String spice;
    boolean isSpicy;
    boolean isSour;
    String grainType;
    String breadType;

    public Sandwich() {
    }

    public Sandwich(boolean isVegetarian, int size, Condiments condiments, Dressing dressing, Meat meat, Veggies veggies, String spice, boolean isSpicy, boolean isSour, String grainType, String breadType) {
        this.isVegetarian = isVegetarian;
        this.size = size;
        this.condiments = condiments;
        this.dressing = dressing;
        this.meat = meat;
        this.veggies = veggies;
        this.spice = spice;
        this.isSpicy = isSpicy;
        this.isSour = isSour;
        this.grainType = grainType;
        this.breadType = breadType;
    }


    @Override
    public String toString() {
        return "Sandwich{" +
                "isVegetarian=" + isVegetarian +
                ", size=" + size +
                ", condiments=" + condiments +
                ", dressing=" + dressing +
                ", meat=" + meat +
                ", veggies=" + veggies +
                ", spice='" + spice + '\'' +
                ", isSpicy=" + isSpicy +
                ", isSour=" + isSour +
                ", grainType='" + grainType + '\'' +
                ", breadType='" + breadType + '\'' +
                '}';
    }
}
