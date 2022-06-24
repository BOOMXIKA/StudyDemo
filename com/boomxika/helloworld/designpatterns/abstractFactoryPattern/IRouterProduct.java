package com.boomxika.helloworld.designpatterns.abstractFactoryPattern;

public interface IRouterProduct {
    //开机
    void start();
    //关机
    void shutdown();
    //打开wifi
    void openwifi();
    //设置
    void setting();
}
