package com.test.design.mode.use.facade_mode;

/**
 * 外观类
 */
public class Facade {

    private static final StepOne stepOne = new StepOne();
    private static final StepTwo stepTwo = new StepTwo();
    private static final StepThree stepThree = new StepThree();

    //点单
    public void order(){
        stepOne.pick();
        stepOne.wash();
        stepOne.stirFry();
        stepOne.serve();
    }

    //加水
    public void water(){
        stepTwo.boiling();
        stepTwo.putTea();
        stepTwo.pourWater();
    }

    //结账
    public void pay(){
        stepThree.settleAccounts();
        stepThree.pay();
    }
}