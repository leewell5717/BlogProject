package com.test.design.mode.use.facade_mode;

import android.app.Activity;
import android.os.Bundle;

import com.test.design.mode.use.R;

/**
 * Description: 外观模式
 */
public class FacadeModeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade_mode);

        Facade facade = new Facade();
        facade.order();
        facade.water();
        facade.pay();
    }
}