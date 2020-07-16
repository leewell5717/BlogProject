package com.test.design.mode.use.strategy_mode;

/**
 * 火车出行
 */
public class TrainTravel implements TravelInterface{
    @Override
    public String travel() {
        return "火车出行";
    }
}