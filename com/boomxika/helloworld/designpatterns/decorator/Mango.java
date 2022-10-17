package com.boomxika.helloworld.designpatterns.decorator;

public class Mango extends Condiment {
    private Beverage beverage;

    public Mango(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 装饰
        return beverage.getDescription() + ", 加芒果";
    }

    @Override
    public double cost() {
        // 装饰
        return beverage.cost() + 3;
    }
}
