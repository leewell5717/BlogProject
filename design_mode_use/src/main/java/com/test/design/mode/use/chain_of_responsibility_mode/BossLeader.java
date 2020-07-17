package com.test.design.mode.use.chain_of_responsibility_mode;

import android.util.Log;

/**
 * 老板
 */
public class BossLeader extends Leader{

    @Override
    public void handle(Leave leave) {
        if(leave.getDay() >= 7){
            Log.e(ChainOfResponsibilityModeActivity.Tag, "老板同意" + leave.getName() + "的请假");
        }
    }
}