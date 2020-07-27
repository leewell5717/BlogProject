package com.test.design.mode.use.mediator_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: 中介者模式
 */
public class MediatorModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator_mode);


        ConcreteMediator concreteHouse = new ConcreteMediator();
        ZhangSan zhangSan = new ZhangSan("张三",concreteHouse);
        LiSi liSi = new LiSi("李四",concreteHouse);
        WangWu wangWu = new WangWu("王五",concreteHouse);

        concreteHouse.setZhangSan(zhangSan);
        concreteHouse.setLiSi(liSi);
        concreteHouse.setWangWu(wangWu);

        zhangSan.sellHouse(121,188);
        Log.e(TAG, "----------------------------");
        liSi.sellHouse(89,249);
        Log.e(TAG, "----------------------------");
        wangWu.sellHouse(61,101);
    }
}