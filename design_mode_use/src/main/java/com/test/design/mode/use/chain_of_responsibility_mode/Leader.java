package com.test.design.mode.use.chain_of_responsibility_mode;

/**
 * 请假流程的总抽象类，用来定义处理对象的公共部分
 */
public abstract class Leader {

    //后继接收者(领导)
    private Leader nextLeader;

    public Leader getNextLeader(){
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader){
        this.nextLeader = nextLeader;
    }

    //处理请假
    public abstract void handle(Leave leave);

}