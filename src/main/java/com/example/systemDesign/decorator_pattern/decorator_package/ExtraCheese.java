package com.example.systemDesign.decorator_pattern.decorator_package;

import com.example.systemDesign.decorator_pattern.base_package.BasePizza;

public class ExtraCheese extends BasePizzaDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
