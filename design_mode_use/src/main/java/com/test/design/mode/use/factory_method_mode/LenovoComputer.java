package com.test.design.mode.use.factory_method_mode;

/**
 * 具体的电脑实体——联想电脑
 */
public class LenovoComputer implements ComputerInterface{

    @Override
    public String getName() {
        return "联想电脑";
    }

    @Override
    public int getPrice() {
        return 4999;
    }
}