package com.test.design.mode.use.observer_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;
import com.test.design.mode.use.observer_mode.custom.MyObservable;
import com.test.design.mode.use.observer_mode.custom.MyObserver;

/**
 * Description: 观察者模式
 */
public class ObserverModeActivity extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_mode);

        WeObserver zhangObserver = new WeObserver("张飞");
        WeObserver guanObserver = new WeObserver("关羽");
        WeObserver liuObserver = new WeObserver("刘备");
        ArticleObservable articleObservable = new ArticleObservable();
        articleObservable.addObserver(zhangObserver);
        articleObservable.addObserver(guanObserver);

        articleObservable.pushArticle("哈哈，我就是标题党");
        articleObservable.pushArticle("震惊！你居然还在做这件事...");

        articleObservable.deleteObserver(guanObserver);
        articleObservable.pushArticle("突发！一年轻小伙在田里挖到宝...");


        Log.e(TAG, "------------------------------------");

        MyObserver myObserver1 = new MyObserver("曹操");
        MyObserver myObserver2 = new MyObserver("曹丕");
        MyObserver myObserver3 = new MyObserver("曹仁");
        MyObservable myObservable = new MyObservable();
        myObservable.addObserver(myObserver1);
        myObservable.addObserver(myObserver2);
        myObservable.sendData("关羽温酒斩华雄");

        myObservable.deleteObserver(myObserver2);
        myObservable.sendData("关羽大意失荆州");
    }
}