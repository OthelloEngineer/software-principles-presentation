package com.example.presentation2022.builderpattern.sandwich;

import com.example.presentation2022.builderpattern.sandwich.toppings.*;

public interface Builder {
    Builder size(int size);
    Builder setDressing (Dressing dressing);
    Builder setCondiments (Condiments condiments);
    Builder setMeat (Meat meat);
    Builder setVeggies (Veggies veggies);
}