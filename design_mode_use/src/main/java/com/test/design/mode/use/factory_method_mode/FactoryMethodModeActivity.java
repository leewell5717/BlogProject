package com.test.design.mode.use.factory_method_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: 工厂方法模式
 */
public class FactoryMethodModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_method_mode);

        ComputerFactory computerFactory1 = new LenovoFactory();
        ComputerInterface computerInterface1 = computerFactory1.getComputerInterface();
        Log.e(TAG, "品牌：" + computerInterface1.getName() + "，价格：" + computerInterface1.getPrice());
        Log.e(TAG, "-----------------------------");
        ComputerFactory computerFactory2 = new DellFactory();
        ComputerInterface computerInterface2 = computerFactory2.getComputerInterface();
        Log.e(TAG, "品牌：" + computerInterface2.getName() + "，价格：" + computerInterface2.getPrice());
    }
}