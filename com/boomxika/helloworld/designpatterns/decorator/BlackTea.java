package com.boomxika.helloworld.designpatterns.decorator;

/**
 * @Author : BOOMXIKA
 */
public class BlackTea implements Beverage {
    @Override
    public String getDescription() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}
