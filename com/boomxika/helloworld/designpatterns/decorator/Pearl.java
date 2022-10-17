package com.boomxika.helloworld.designpatterns.decorator;

public class Pearl extends Condiment {
    private Beverage beverage;

    public Pearl(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 装饰
        return beverage.getDescription() + ", 加珍珠";
    }

    @Override
    public double cost() {
        // 装饰
        return beverage.cost() + 1;
    }
}
