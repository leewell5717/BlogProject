package com.test.design.mode.use.chain_of_responsibility_mode;

import android.util.Log;

/**
 * 直系领导(小组领导)
 */
public class GroupLeader extends Leader{

    @Override
    public void handle(Leave leave) {
        if(leave.getDay() <= 2 && leave.getDay() > 0){
            Log.e(ChainOfResponsibilityModeActivity.Tag, "直系领导同意" + leave.getName() + "的请假");
        }else{
            Log.e(ChainOfResponsibilityModeActivity.Tag, "直系领导没有权限批准" + leave.getName() + "的请假");
            getNextLeader().handle(leave);
        }
    }
}