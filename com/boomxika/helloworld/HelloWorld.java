package com.boomxika.helloworld;

import com.boomxika.helloworld.designpatterns.decorator.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("开启我的快乐小天地");

        //装饰器模式
        // 首先，我们需要一个基础饮料，红茶、绿茶或咖啡
        Beverage beverage = new GreenTea();
        // 开始装饰
        // 先加一份柠檬
        beverage = new Lemon(beverage);
        // 再加一份芒果
        beverage = new Mango(beverage);
        //"绿茶, 加柠檬, 加芒果 价格：￥16"
        System.out.println(beverage.getDescription() + " 价格：￥" + beverage.cost());
        //芒果珍珠双份柠檬红茶
        Beverage beverage1 = new Mango(new Pearl(new Lemon(new Lemon(new BlackTea()))));
    }
}
