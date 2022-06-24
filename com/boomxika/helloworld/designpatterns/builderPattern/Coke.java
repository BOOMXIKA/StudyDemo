package com.boomxika.helloworld.designpatterns.builderPattern;

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
