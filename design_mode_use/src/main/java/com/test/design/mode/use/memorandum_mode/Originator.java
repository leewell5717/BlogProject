package com.test.design.mode.use.memorandum_mode;

import android.util.Log;

/**
 * 发起角色——文章写作
 */
public class Originator {

    private static final String TAG = "XXX";

    //写作字数
    private int writeCount;
    //写作语言
    private String language;
    //写作时间
    private String time;

    public int getWriteCount() {
        return writeCount;
    }

    public void setWriteCount(int writeCount) {
        this.writeCount = writeCount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "在：" + time + "，使用：" + language + "，写了：" + writeCount + "个字";
    }

    /**
     * 开始写作
     */
    public void startWrite(){
        writeCount = 800;
        language = "中文";
        time = "7月20日";
        Log.e(TAG, "开始写作。" + toString());
    }

    /**
     * 停止写作
     */
    public void stopWrite(){
        Log.e(TAG, "停止写作");
    }

    /**
     * 保存写作状态
     */
    public Memorandum saveWrite(){
        Memorandum memorandum = new Memorandum();
        memorandum.setWriteCount(writeCount);
        memorandum.setLanguage(language);
        memorandum.setTime(time);
        return memorandum;
    }

    /**
     * 恢复写作
     */
    public void restoreWrite(Memorandum memorandum){
        this.writeCount = memorandum.getWriteCount();
        this.language = memorandum.getLanguage();
        this.time = memorandum.getTime();
        Log.e(TAG, "恢复写作。" + toString());
    }
}