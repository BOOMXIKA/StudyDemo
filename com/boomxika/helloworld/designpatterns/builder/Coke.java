package com.boomxika.helloworld.designpatterns.builder;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 3.5F;
    }
}
