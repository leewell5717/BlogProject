package com.test.design.mode.use.state_mode;

/**
 * 查询订单状态
 */
public class Check {

    public static final PaidState PAID_STATE = new PaidState();
    public static final ShippedState SHIPPED_STATE = new ShippedState();
    public static final ReceivedState RECEIVED_STATE = new ReceivedState();
    public static final FinishedState FINISHED_STATE = new FinishedState();

    //默认初始是已下单状态
    private State state = PAID_STATE;

    public void setState(State state){
        this.state = state;
    }

    //查询订单状态
    public void doCheck(){
        state.printState();
    }
}