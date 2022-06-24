package com.boomxika.helloworld.designpatterns.abstractFactoryPattern.huawei;

import com.boomxika.helloworld.designpatterns.abstractFactoryPattern.IPhoneProduct;

public class HuaWeiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void callup() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发邮件");
    }
}