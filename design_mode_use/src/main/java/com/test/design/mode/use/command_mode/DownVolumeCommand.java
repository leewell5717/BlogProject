package com.test.design.mode.use.command_mode;

import android.util.Log;

/**
 * 具体的命令角色——减小音量
 */
public class DownVolumeCommand implements Command {

    private static final String TAG = "XXX";
    private TV tv;

    public DownVolumeCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void excute() {
        Log.e(TAG, "声音太大，我要减小音量");
        tv.downVolume();
    }
}