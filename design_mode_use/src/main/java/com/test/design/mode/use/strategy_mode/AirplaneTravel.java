package com.test.design.mode.use.strategy_mode;

/**
 * 飞机出行
 */
public class AirplaneTravel implements TravelInterface{
    @Override
    public String travel() {
        return "飞机出行";
    }
}