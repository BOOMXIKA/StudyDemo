package com.boomxika.helloworld.designpatterns.builder;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chickenBurger";
    }

    @Override
    public float price() {
        return 7.77F;
    }
}
