package com.test.design.mode.use.chain_of_responsibility_mode;

import android.util.Log;

/**
 * 总监
 */
public class DirectorLeader extends Leader{

    @Override
    public void handle(Leave leave) {
        if(leave.getDay() < 7 && leave.getDay() >= 5){
            Log.e(ChainOfResponsibilityModeActivity.Tag, "总监同意" + leave.getName() + "的请假");
        }else{
            Log.e(ChainOfResponsibilityModeActivity.Tag, "总监没有权限批准" + leave.getName() + "的请假");
            getNextLeader().handle(leave);
        }
    }
}