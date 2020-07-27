package com.test.design.mode.use.mediator_mode;

/**
 * 抽象的协作者-卖家
 */
public abstract class Seller {

    protected static final String TAG = "XXX";

    protected String name;
    protected Mediator mediator;

    public Seller(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public void sellHouse(int area, int price){
        mediator.sale(this, area, price);
    }

    //展示优点
    public abstract void showAdvantage();

}