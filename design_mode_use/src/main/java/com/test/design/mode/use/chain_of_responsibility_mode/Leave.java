package com.test.design.mode.use.chain_of_responsibility_mode;

/**
 * 请假实体
 */
public class Leave {

    //请假人
    private String name;
    //请假原因
    private String reason;
    //请假天数
    private int day;

    public Leave(String name,String reason,int day){
        this.name = name;
        this.reason = reason;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "本人" + name + "，由于：" + reason + "，需要请假：" + day + "天";
    }
}