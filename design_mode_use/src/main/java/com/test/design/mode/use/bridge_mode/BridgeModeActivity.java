package com.test.design.mode.use.bridge_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * desc: 桥接模式
 */
public class BridgeModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge_mode);

        Shape redCircle = new Circle(new RedCircle(),100,100,50);
        redCircle.draw();

        Log.e(TAG, "----------------------");
        Shape greenCircle = new Circle(new GreenCircle(),300,300,100);
        greenCircle.draw();

    }
}