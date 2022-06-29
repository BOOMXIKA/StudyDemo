package com.boomxika.helloworld.designpatterns.builder;

public interface Item {
    String name();

    Packing packing();

    float price();
}
