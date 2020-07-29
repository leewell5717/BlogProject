package com.test.design.mode.use.decorator_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: 装饰器模式
 */
public class DecoratorModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator_mode);

        Person person = new ZhangSan();
        Log.e(TAG, "装饰前-------------------------");
        person.run();
        person.eat();
        Log.e(TAG, "装饰后-------------------------");
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(person);
        concreteDecorator.eat();
        concreteDecorator.run();
    }
}