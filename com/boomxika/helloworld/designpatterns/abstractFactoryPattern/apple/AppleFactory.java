package com.boomxika.helloworld.designpatterns.abstractFactoryPattern.apple;

import com.boomxika.helloworld.designpatterns.abstractFactoryPattern.IPhoneProduct;
import com.boomxika.helloworld.designpatterns.abstractFactoryPattern.IRouterProduct;
import com.boomxika.helloworld.designpatterns.abstractFactoryPattern.ProductFactory;

public class AppleFactory implements ProductFactory {
    @Override
    public IPhoneProduct getIPhoneProduct() {
        return new ApplePhone();
    }

    @Override
    public IRouterProduct getIRouterProduct() {
        return new AppleRouter();
    }
}