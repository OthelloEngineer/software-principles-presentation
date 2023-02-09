package com.example.presentation2022.builderpattern.sandwich;

import com.example.presentation2022.builderpattern.sandwich.toppings.Condiments;
import com.example.presentation2022.builderpattern.sandwich.toppings.Dressing;
import com.example.presentation2022.builderpattern.sandwich.toppings.Meat;
import com.example.presentation2022.builderpattern.sandwich.toppings.Veggies;

public class BagelBuilder implements Builder {
    private Bagel bagel = new Bagel();
    @Override
    public Builder size(int size) {
        bagel.size = size;
        return this;
    }

    @Override
    public Builder setDressing(Dressing dressing) {
        bagel.dressing = dressing;
        return this;
    }

    @Override
    public Builder setCondiments(Condiments condiments) {
        bagel.condiments = condiments;
        return this;
    }

    @Override
    public Builder setMeat(Meat meat) {
        bagel.meat = meat;
        return this;
    }

    @Override
    public Builder setVeggies(Veggies veggies) {
        bagel.veggies = veggies;
        return this;
    }

    public void setHoleWidth(int size){
        this.bagel.holeSize = size;
    }

    public Bagel build() {
        if(this.bagel.meat == null){
            this.bagel.isVegetarian = true;
        }
        Bagel result = this.bagel;
        this.bagel = new Bagel();
        return result;
    }
}
