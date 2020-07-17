package com.test.design.mode.use.template_method_mode;

import android.util.Log;

/**
 * 李四个人简历
 */
public class LiSiResume extends AndroidResumeTemplate {

    private static final String TAG = "XXX";
    private String name;

    public LiSiResume(String name){
        this.name = name;
    }

    @Override
    protected void selfIntroduction() {
        Log.e(TAG, name + "，个人介绍：" + "本人29岁，毕业于成都电子科技大学，现有6年工作经验，希望薪资是30k");
    }

    @Override
    protected void workExperience() {
        Log.e(TAG, name + "，工作经验：" + "2013-2015在阿里巴巴工作2年；2016-2018在腾讯工作2年；2019-至今在网易工作2年");
    }

    @Override
    protected void projectExperience() {
        Log.e(TAG, name + "，项目经验：" + "开发了手机支付宝；开发了腾讯QQ；开发了企业微信App...");
    }

    @Override
    protected void skillProficiency() {
        //不使用默认实现，因为我的技能更加厉害，所以我要重写这个方法
        Log.e(TAG, name + "，技能熟练度：" + "精通C/C++；精通Java；精通Kotlin；精通SQL数据库");
    }

    @Override
    protected void other() {
        schoolReward();
    }

    //在校获奖
    private void schoolReward(){
        Log.e(TAG, name + "，在校获得奖项：" + "获得全国大学生数学建模一等奖；获得成都电子科技大学编程大赛金牌");
    }
}