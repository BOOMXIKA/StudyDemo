package com.boomxika.helloworld.designpatterns.abstractfactory;

import com.boomxika.helloworld.designpatterns.abstractfactory.apple.AppleFactory;
import com.boomxika.helloworld.designpatterns.abstractfactory.huawei.HuaWeiFactory;

public class AbstoryFactory {
    public static ProductFactory getProductFactory(String key) {
        if ("".equals(key)) {
            return new HuaWeiFactory();
        } else if ("".equals(key)) {
            return new AppleFactory();
        }
        return null;
    }
}
