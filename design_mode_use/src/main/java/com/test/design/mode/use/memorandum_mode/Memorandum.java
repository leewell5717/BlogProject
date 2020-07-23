package com.test.design.mode.use.memorandum_mode;

/**
 * 备忘录角色
 */
public class Memorandum {

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
}