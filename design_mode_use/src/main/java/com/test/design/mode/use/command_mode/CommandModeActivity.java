package com.test.design.mode.use.command_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: 命令模式
 */
public class CommandModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_mode);

        TV tv = new TV();
        ChangeChannelCommand changeChannelCommand = new ChangeChannelCommand(tv);
        DownVolumeCommand downVolumeCommand = new DownVolumeCommand(tv);
        UpVolumeCommand upVolumeCommand = new UpVolumeCommand(tv);
        TVControl control = new TVControl(changeChannelCommand);
        control.doAction();
        Log.e(TAG, "----------------------");
        control.setCommand(downVolumeCommand);
        control.doAction();
        Log.e(TAG, "----------------------");
        control.setCommand(upVolumeCommand);
        control.doAction();
    }
}