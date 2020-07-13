package com.test.design.mode.use.factory_method_mode;

/**
 * 具体的电脑工厂——戴尔电脑工厂
 */
public class DellFactory implements ComputerFactory{

    @Override
    public ComputerInterface getComputerInterface() {
        return new DellComputer();
    }
}