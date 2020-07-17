package com.test.design.mode.use.template_method_mode;

import android.util.Log;

/**
 * 王五个人简历
 */
public class WangWuResume extends AndroidResumeTemplate {

    private static final String TAG = "XXX";
    private String name;

    public WangWuResume(String name){
        this.name = name;
    }

    @Override
    protected void selfIntroduction() {
        Log.e(TAG, name + "，个人介绍：" + "本人33岁，毕业于西安电子科技大学，现有9年工作经验，希望薪资是50k");
    }

    @Override
    protected void workExperience() {
        Log.e(TAG, name + "，工作经验：" + "2011-2014在华为工作3年；2014-2017在小米工作3年；2017-2020在谷歌工作4年");
    }

    @Override
    protected void projectExperience() {
        Log.e(TAG, name + "，项目经验：" + "开发了华为手机应用商店；开发了小米MIUI操作系统；参与开发Android 11系统...");
    }

    @Override
    protected void skillProficiency() {
        //不使用默认实现，因为我的技能更加厉害，所以我要重写这个方法
        Log.e(TAG, name + "，技能熟练度：" + "精通C/C++；精通Java；精通Linux系统；精通各种音视频开发....");
    }

    @Override
    protected void other() {
        schoolReward();
        personalAchievement();
    }

    //在校获奖
    private void schoolReward(){
        Log.e(TAG, name + "，在校获得奖项：" + "获得全国大学生编程设计ACM竞赛一等奖；获得全国AI人工智能竞赛二等奖");
    }

    //个人作品成果
    private void personalAchievement(){
        Log.e(TAG, name + "，个人作品：" + "设计出在线火车票订票系统；团体研发出餐饮店点餐系统App");
    }
}