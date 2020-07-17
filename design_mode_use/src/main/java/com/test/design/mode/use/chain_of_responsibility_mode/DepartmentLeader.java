package com.test.design.mode.use.chain_of_responsibility_mode;

import android.util.Log;

/**
 * 部门领导
 */
public class DepartmentLeader extends Leader{

    @Override
    public void handle(Leave leave) {
        if(leave.getDay() < 5 && leave.getDay() >= 3){
            Log.e(ChainOfResponsibilityModeActivity.Tag, "部门领导同意" + leave.getName() + "的请假");
        }else{
            Log.e(ChainOfResponsibilityModeActivity.Tag, "部门领导没有权限批准" + leave.getName() + "的请假");
            getNextLeader().handle(leave);
        }
    }
}