package com.example.presentation2022.builderpattern.sandwich;

import com.example.presentation2022.builderpattern.sandwich.toppings.*;

public class SandwichBuilder implements Builder{
    public Sandwich build() {
        if(this.sandwich.meat == null){
            this.sandwich.isVegetarian = true;
        }
        Sandwich result = this.sandwich;
        this.sandwich = new Sandwich();
        return result;
    }

    private Sandwich sandwich = new Sandwich();

    @Override
    public Builder size(int size) {
        sandwich.size = size;
        return this;
    }

    @Override
    public Builder setDressing(Dressing dressing) {
        sandwich.dressing = dressing;
        return this;
    }

    @Override
    public Builder setCondiments(Condiments condiments) {
        sandwich.condiments = condiments;
        return this;
    }

    @Override
    public Builder setMeat(Meat meat) {
        sandwich.meat = meat;
        return this;
    }

    @Override
    public Builder setVeggies(Veggies veggies) {
        sandwich.veggies = veggies;
        return this;
    }
}
