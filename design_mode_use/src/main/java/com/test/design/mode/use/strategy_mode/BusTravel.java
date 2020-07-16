package com.test.design.mode.use.strategy_mode;

/**
 * 汽车出行
 */
public class BusTravel implements TravelInterface{
    @Override
    public String travel() {
        return "汽车出行";
    }
}