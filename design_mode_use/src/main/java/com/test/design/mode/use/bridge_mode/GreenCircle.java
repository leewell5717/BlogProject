package com.test.design.mode.use.bridge_mode;

import android.util.Log;

public class GreenCircle implements DrawInterface {

    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.e(TAG, "绘制绿色圆形，半径：" + radius + "，X坐标：" + x + "，y坐标：" + y);
    }
}