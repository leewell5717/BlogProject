package com.test.design.mode.use.strategy_mode;

public class WhichTransportation {

    private TravelInterface travelInterface;

    public WhichTransportation(TravelInterface travelInterface){
        this.travelInterface = travelInterface;
    }

    public void setTravelInterface(TravelInterface travelInterface){
        this.travelInterface = travelInterface;
    }

    public String select(){
        return "我选择：" + travelInterface.travel();
    }
}