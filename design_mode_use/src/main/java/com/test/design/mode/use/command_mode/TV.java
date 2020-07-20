package com.test.design.mode.use.command_mode;

import android.util.Log;

/**
 * 命令接收者角色——电视机
 */
public class TV {

    private static final String TAG = "XXX";

    public void downVolume() {
        Log.e(TAG, "电视机——减小音量");
    }

    public void upVolume() {
        Log.e(TAG, "电视机——加大音量");
    }

    public void changeChannel() {
        Log.e(TAG, "电视机——换台");
    }
}