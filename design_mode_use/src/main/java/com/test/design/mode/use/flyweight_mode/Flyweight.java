package com.test.design.mode.use.flyweight_mode;

/**
 * 抽象享元角色类
 */
public interface Flyweight {

    String TAG = "XXX";

    //一个示意性方法，参数state是外蕴状态
    void operation(String state);
}