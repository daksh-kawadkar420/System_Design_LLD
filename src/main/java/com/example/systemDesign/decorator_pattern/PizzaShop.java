package com.example.systemDesign.decorator_pattern;

import com.example.systemDesign.decorator_pattern.base_package.Farmhouse;
import com.example.systemDesign.decorator_pattern.decorator_package.BasePizzaDecorator;
import com.example.systemDesign.decorator_pattern.decorator_package.ExtraCheese;
import com.example.systemDesign.decorator_pattern.decorator_package.ExtraVegies;
import com.example.systemDesign.decorator_pattern.decorator_package.Mashrooms;

public class PizzaShop {
    public static void main(String[] args) {
        BasePizzaDecorator finalPizza = new Mashrooms(new ExtraVegies(new ExtraCheese(new Farmhouse())));
        System.out.println("Final Cose of Your Ordered Pizza : " + finalPizza.cost());
    }
}
