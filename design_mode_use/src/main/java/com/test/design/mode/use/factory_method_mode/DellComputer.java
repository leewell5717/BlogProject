package com.test.design.mode.use.factory_method_mode;

/**
 * 具体的电脑实体——戴尔电脑
 */
public class DellComputer implements ComputerInterface{

    @Override
    public String getName() {
        return "戴尔电脑";
    }

    @Override
    public int getPrice() {
        return 5999;
    }
}