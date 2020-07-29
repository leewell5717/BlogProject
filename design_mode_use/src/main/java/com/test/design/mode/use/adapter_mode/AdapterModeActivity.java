package com.test.design.mode.use.adapter_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: 适配器模式
 */
public class AdapterModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_mode);

        Log.e(TAG, "使用类适配器-----------------------");
        classAdapter();
        Log.e(TAG, "使用对象适配器-----------------------");
        objectAdapter();
    }

    /**
     * 类适配器
     */
    private void classAdapter(){
        VoltageCommon voltage = new HomeUse();
        int v = voltage.output220Voltage();
        showResult(v);
        v = new VoltageClassAdapter().output5Voltage();
        showResult(v);
    }

    /**
     * 对象适配器
     */
    private void objectAdapter(){
        VoltageCommon voltage = new HomeUse();
        int v = voltage.output220Voltage();
        showResult(v);
        v = new VoltageObjectAdapter(voltage).output5Voltage();
        showResult(v);
    }

    private void showResult(int v){
        Log.e(TAG, "当前电压：" + v);
        if(v > 5){
            Log.e(TAG, "超过正常充电电压，无法充电");
        }else{
            Log.e(TAG, "电压正常，开始充电");
        }
    }
}