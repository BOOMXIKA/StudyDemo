package com.boomxika.helloworld.designpatterns.abstractfactory;

public interface ProductFactory {
    IPhoneProduct getIPhoneProduct();

    IRouterProduct getIRouterProduct();
}
