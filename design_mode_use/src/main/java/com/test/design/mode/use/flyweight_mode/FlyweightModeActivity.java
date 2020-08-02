package com.test.design.mode.use.flyweight_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;
import com.test.design.mode.use.flyweight_mode.simple.FlyweightFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * desc: 享元模式
 */
public class FlyweightModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyweight_mode);

        simpleFlyweight();
        Log.e(TAG, "****************************");
        compositeFlyweight();
    }

    /**
     * 单纯享元模式
     */
    private void simpleFlyweight() {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory('a');
        fly.operation("第一次调用");

        Log.e(TAG, "---------------------");
        fly = factory.factory('b');
        fly.operation("第二次调用");

        Log.e(TAG, "---------------------");
        fly = factory.factory('a');
        fly.operation("第三次调用");
    }

    /**
     * 复合享元模式
     */
    private void compositeFlyweight() {
        List<Character> compositeState = new ArrayList<>();
        compositeState.add('a');
        compositeState.add('b');
        compositeState.add('c');
        compositeState.add('a');
        compositeState.add('b');

        FlyweightFactory flyFactory = new FlyweightFactory();
        Flyweight compositeFly1 = flyFactory.factory(compositeState);
        Flyweight compositeFly2 = flyFactory.factory(compositeState);
        compositeFly1.operation("复合调用");

        Log.e(TAG, "---------------------");
        Log.e(TAG, "复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

        Character state = 'a';
        Flyweight fly1 = flyFactory.factory(state);
        Flyweight fly2 = flyFactory.factory(state);
        Log.e(TAG, "单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }

}