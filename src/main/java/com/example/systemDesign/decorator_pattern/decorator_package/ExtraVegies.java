package com.example.systemDesign.decorator_pattern.decorator_package;

import com.example.systemDesign.decorator_pattern.base_package.BasePizza;

public class ExtraVegies extends BasePizzaDecorator {

    BasePizza basePizza;

    public ExtraVegies(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
