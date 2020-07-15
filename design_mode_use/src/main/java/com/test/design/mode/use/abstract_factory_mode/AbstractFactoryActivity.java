package com.test.design.mode.use.abstract_factory_mode;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.test.design.mode.use.R;
import com.test.design.mode.use.abstract_factory_mode.factory.AbstractFactoryInterface;
import com.test.design.mode.use.abstract_factory_mode.pad.PadInterface;
import com.test.design.mode.use.abstract_factory_mode.phone.PhoneInterface;

/**
 * 抽象工厂模式
 */
public class AbstractFactoryActivity extends Activity {

    public static final String FactoryType1 = "FactoryType1";
    public static final String FactoryType2 = "FactoryType2";

    private static final String TAG = "XXX";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory_mode);

        //测试
        AbstractFactoryInterface factoryInterface1 = MyFactory.getFactory(FactoryType1);
        PhoneInterface huaweiPhoneInterface = factoryInterface1.getPhone();
        PadInterface applePadInterface = factoryInterface1.getPad();
        Log.e(TAG, "huaweiPhoneInterface：" + huaweiPhoneInterface.getName());
        Log.e(TAG, "applePadInterface：" + applePadInterface.getName());

        Log.e(TAG, "-------------------------------");

        AbstractFactoryInterface factoryInterface2 = MyFactory.getFactory(FactoryType2);
        PhoneInterface xiaomiPhoneInterface = factoryInterface2.getPhone();
        PadInterface surfacePadInterface = factoryInterface2.getPad();
        Log.e(TAG, "xiaomiPhoneInterface：" + xiaomiPhoneInterface.getName());
        Log.e(TAG, "surfacePadInterface：" + surfacePadInterface.getName());
    }
}