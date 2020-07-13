package com.test.design.mode.use.factory_method_mode;

/**
 * 具体的电脑实体——惠普电脑
 */
public class HPComputer implements ComputerInterface{

    @Override
    public String getName() {
        return "惠普电脑";
    }

    @Override
    public int getPrice() {
        return 3999;
    }
}