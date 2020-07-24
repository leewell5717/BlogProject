package com.test.design.mode.use.visitor_mode;

import android.app.Activity;
import android.os.Bundle;

import com.test.design.mode.use.R;

/**
 * Description: 访问者模式
 */
public class VisitorModeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor_mode);

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addObj(new Eat());
        objectStructure.addObj(new WatchTV());
        Visitor visitor = new ZhangSanVisitor("张三");
        objectStructure.doAction(visitor);

        Visitor visitor1 = new LiSiVisitor("李四");
        objectStructure.doAction(visitor1);
    }
}