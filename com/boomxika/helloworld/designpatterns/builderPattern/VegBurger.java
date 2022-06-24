package com.boomxika.helloworld.designpatterns.builderPattern;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 6.66F;
    }
}