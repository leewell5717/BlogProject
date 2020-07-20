package com.test.design.mode.use.command_mode;

/**
 * 命令请求者角色——遥控器
 */
public class TVControl {

    private Command command;

    public TVControl(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    //发送请求
    public void doAction(){
        command.excute();
    }
}