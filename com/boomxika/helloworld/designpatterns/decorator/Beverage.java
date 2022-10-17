package com.boomxika.helloworld.designpatterns.decorator;

/**
 *  装饰器模式
 */
public interface Beverage {
    /**
     * 返回描述
     * @return
     */
     String getDescription();

    /**
     * 返回价格
     * @return
     */
    double cost();
}
