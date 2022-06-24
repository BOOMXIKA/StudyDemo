package com.boomxika.helloworld.designpatterns.abstractFactoryPattern;

public interface ProductFactory {
    IPhoneProduct getIPhoneProduct();

    IRouterProduct getIRouterProduct();
}
