package com.boomxika.helloworld.designpatterns.abstractfactory.huawei;

import com.boomxika.helloworld.designpatterns.abstractfactory.IPhoneProduct;
import com.boomxika.helloworld.designpatterns.abstractfactory.IRouterProduct;
import com.boomxika.helloworld.designpatterns.abstractfactory.ProductFactory;

public class HuaWeiFactory implements ProductFactory {
    @Override
    public IPhoneProduct getIPhoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct getIRouterProduct() {
        return new HuaWeiRouter();
    }
}
