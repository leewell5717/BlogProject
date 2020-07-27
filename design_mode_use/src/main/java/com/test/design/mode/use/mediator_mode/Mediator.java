package com.test.design.mode.use.mediator_mode;

/**
 * 抽象中介者
 */
public interface Mediator {
    //卖房
    void sale(Seller agent, int area, int price);
}