package com.boomxika.helloworld.designpatterns.abstractFactoryPattern;

import com.boomxika.helloworld.designpatterns.abstractFactoryPattern.apple.AppleFactory;
import com.boomxika.helloworld.designpatterns.abstractFactoryPattern.huawei.HuaWeiFactory;

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
