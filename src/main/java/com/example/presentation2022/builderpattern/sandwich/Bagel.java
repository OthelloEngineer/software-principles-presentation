package com.example.presentation2022.builderpattern.sandwich;

import com.example.presentation2022.builderpattern.sandwich.toppings.Condiments;
import com.example.presentation2022.builderpattern.sandwich.toppings.Dressing;
import com.example.presentation2022.builderpattern.sandwich.toppings.Meat;
import com.example.presentation2022.builderpattern.sandwich.toppings.Veggies;

public class Bagel {
    public boolean isVegetarian;
    int size;
    Condiments condiments;
    Dressing dressing;
    Meat meat;
    Veggies veggies;
    int holeSize;

    @Override
    public String toString() {
        return "Bagel{" +
                "isVegan=" + isVegetarian +
                ", size=" + size +
                ", condiments=" + condiments +
                ", dressing=" + dressing +
                ", meat=" + meat +
                ", veggies=" + veggies +
                ", holeSize=" + holeSize +
                '}';
    }
}