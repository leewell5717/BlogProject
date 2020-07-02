package com.test.design.mode.use.singleton_mode;

import android.util.Log;

/**
 * 单例模式-java版本
 */
public class SingletonModeForJava {

    private static final String TAG = "XXX";

    /**
     * 饿汉式
     */
    public static class SingletonModeOne {
        private static final SingletonModeOne singletonModeOne = new SingletonModeOne();

        private SingletonModeOne() {
        }

        public static SingletonModeOne getInstance() {
            return singletonModeOne;
        }

        public void showMsg(String msg) {
            Log.e(TAG, "SingletonModeOne ---> showMsg：" + msg);
        }
    }

    /**
     * 懒汉式
     */
    public static class SingletonModeTwo {

        private static SingletonModeTwo singletonModeTwo;

        private SingletonModeTwo() {
        }

        public static synchronized SingletonModeTwo getInstance() {
            if (singletonModeTwo == null) {
                singletonModeTwo = new SingletonModeTwo();
            }
            return singletonModeTwo;
        }

        public void showMsg(String msg) {
            Log.e(TAG, "SingletonModeOne ---> showMsg：" + msg);
        }
    }

    /**
     * 双重验证锁
     */
    public static class SingletonModeThree {

        private static volatile SingletonModeThree singletonModeThree = null;

        private SingletonModeThree() {
        }

        public static SingletonModeThree getInstance() {
            if (singletonModeThree == null) {
                synchronized (SingletonModeThree.class) {
                    if (singletonModeThree == null) {
                        singletonModeThree = new SingletonModeThree();
                    }
                }
            }
            return singletonModeThree;
        }

        public void showMsg(String msg) {
            Log.e(TAG, "SingletonModeFour ---> showMsg：" + msg);
        }
    }

    /**
     * 静态内部类
     */
    public static class SingletonModeFour {

        private SingletonModeFour() {
        }

        private static class InnerSingletonMode {
            private static SingletonModeFour singletonModeFour = new SingletonModeFour();
        }

        public static SingletonModeFour getInstance() {
            return InnerSingletonMode.singletonModeFour;
        }

        public void showMsg(String msg) {
            Log.e(TAG, "SingletonModeThree ---> showMsg：" + msg);
        }
    }

    /**
     * 枚举
     */
    public enum SingletonModeFive {
        singletonModeFive;

        public void showMsg(String msg) {
            Log.e(TAG, "SingletonModeFive ---> showMsg：" + msg);
        }
    }

}