package com.boomxika.helloworld.designpatterns.builderPattern;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 2.5F;
    }
}
