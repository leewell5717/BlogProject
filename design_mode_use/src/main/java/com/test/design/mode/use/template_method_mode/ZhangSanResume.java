package com.test.design.mode.use.template_method_mode;

import android.util.Log;

/**
 * 张三个人简历
 */
public class ZhangSanResume extends AndroidResumeTemplate {

    private static final String TAG = "XXX";
    private String name;

    public ZhangSanResume(String name){
        this.name = name;
    }

    @Override
    protected void selfIntroduction() {
        Log.e(TAG, name + "，个人介绍：" + "本人27岁，毕业于哈佛大学，现有4年工作经验，希望薪资是25k");
    }

    @Override
    protected void workExperience() {
        Log.e(TAG, name + "，工作经验：" + "2014-2016在谷歌工作2年；2017-2020在微软工作3年");
    }

    @Override
    protected void projectExperience() {
        Log.e(TAG, name + "，项目经验：" + "开发了Facebook；开发了淘宝App；开发了OPPO应用商店...");
    }
}