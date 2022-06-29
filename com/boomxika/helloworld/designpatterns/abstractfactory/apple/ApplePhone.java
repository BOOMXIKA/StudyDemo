package com.boomxika.helloworld.designpatterns.abstractfactory.apple;

import com.boomxika.helloworld.designpatterns.abstractfactory.IPhoneProduct;

public class ApplePhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开启Apple手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭Apple手机");
    }

    @Override
    public void callup() {
        System.out.println("Apple手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("Apple手机发邮件");
    }
}
