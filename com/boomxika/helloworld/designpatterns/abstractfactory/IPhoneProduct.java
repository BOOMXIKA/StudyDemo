package com.boomxika.helloworld.designpatterns.abstractfactory;

public interface IPhoneProduct {
    //开机
    void start();
    //关机
    void shutdown();
    //打电话
    void callup();
    //发邮件
    void sendSMS();
}
