package com.test.design.mode.use.template_method_mode;

import android.util.Log;

/**
 * 通用简历模版
 */
public abstract class AndroidResumeTemplate {

    //自我介绍
    protected abstract void selfIntroduction();
    //工作经历
    protected abstract void workExperience();
    //项目经历
    protected abstract void projectExperience();
    //技能熟练度——提供默认实现
    protected void skillProficiency(){
        //Android程序员必须能够熟练使用Java语言
        Log.e("XXX","技能熟练度：熟练Java");
    }

    //写简历
    protected void write(){
        selfIntroduction();
        workExperience();
        projectExperience();
        skillProficiency();
        other();
    }

    //其他
    protected void other(){

    }
}