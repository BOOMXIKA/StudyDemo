package com.boomxika.helloworld.designpatterns.builder;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
