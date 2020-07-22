package com.test.design.mode.use.state_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: 状态模式
 */
public class StateModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_mode);

        Check check = new Check();
        check.setState(Check.PAID_STATE);
        check.doCheck();

        Log.e(TAG, "-------------------------");
        check.setState(Check.RECEIVED_STATE);
        check.doCheck();

        Log.e(TAG, "-------------------------");
        check.setState(Check.FINISHED_STATE);
        check.doCheck();
    }
}