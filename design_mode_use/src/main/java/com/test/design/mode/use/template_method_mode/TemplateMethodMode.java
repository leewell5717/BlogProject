package com.test.design.mode.use.template_method_mode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.test.design.mode.use.R;

/**
 * Description: 模版方法模式
 */
public class TemplateMethodMode extends Activity {

    private static final String TAG = "XXX";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_method_mode);

        AndroidResumeTemplate zhang = new ZhangSanResume("张三");
        zhang.write();
        Log.e(TAG, "--------------------");
        AndroidResumeTemplate li = new LiSiResume("李四");
        li.write();
        Log.e(TAG, "--------------------");
        AndroidResumeTemplate wang = new WangWuResume("王五");
        wang.write();
    }
}