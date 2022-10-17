package com.boomxika.helloworld.designpatterns.decorator;

public class Lemon extends Condiment {
    private Beverage beverage;

    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 装饰
        return beverage.getDescription() + ", 加柠檬";
    }

    @Override
    public double cost() {
        // 装饰
        return beverage.cost() + 2;
    }
}
