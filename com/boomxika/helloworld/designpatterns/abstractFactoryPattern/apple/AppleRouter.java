package com.boomxika.helloworld.designpatterns.abstractFactoryPattern.apple;

import com.boomxika.helloworld.designpatterns.abstractFactoryPattern.IRouterProduct;

public class AppleRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("开启Apple路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭Apple路由器");
    }

    @Override
    public void openwifi() {
        System.out.println("打开Applewifi");
    }

    @Override
    public void setting() {
        System.out.println("设置Apple路由器");
    }
}
