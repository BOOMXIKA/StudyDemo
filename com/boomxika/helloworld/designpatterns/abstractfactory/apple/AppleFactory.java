package com.boomxika.helloworld.designpatterns.abstractfactory.apple;

import com.boomxika.helloworld.designpatterns.abstractfactory.IPhoneProduct;
import com.boomxika.helloworld.designpatterns.abstractfactory.IRouterProduct;
import com.boomxika.helloworld.designpatterns.abstractfactory.ProductFactory;

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
