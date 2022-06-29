package com.boomxika.helloworld.designpatterns.builder;

public class Bottle implements Packing {
    @Override
    public String packing() {
        return "bottle";
    }
}
