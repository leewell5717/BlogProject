package com.test.design.mode.use.command_mode;

import android.util.Log;

/**
 * 具体的命令角色——换台
 */
public class ChangeChannelCommand implements Command {

    private static final String TAG = "XXX";
    private TV tv;

    public ChangeChannelCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void excute() {
        Log.e(TAG, "这个台不好看，我要换台");
        tv.changeChannel();
    }
}