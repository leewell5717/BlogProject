package com.test.design.mode.use.decorator_mode;

/**
 * 抽象的被装饰者——人
 */
public interface Person {

    String TAG = "XXX";

    //定义了2个基本的特征：吃饭、跑步
    void eat();
    void run();
}