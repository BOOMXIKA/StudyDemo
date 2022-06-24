package com.boomxika.helloworld.designpatterns.abstractFactoryPattern.huawei;

import com.boomxika.helloworld.designpatterns.abstractFactoryPattern.IPhoneProduct;
import com.boomxika.helloworld.designpatterns.abstractFactoryPattern.IRouterProduct;
import com.boomxika.helloworld.designpatterns.abstractFactoryPattern.ProductFactory;

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
