package com.test.design.mode.use.singleton_mode

import android.content.Context

/**
 * 单例模式-kotlin版本
 */
class SingletonModeForKotlin {

    object SingletonModeOne {
        fun showMsg(str: String) {
            println("SingletonModeOne ---> showMsg：${str}")
        }
    }

    class SingletonModeTwo private constructor(myContext: Context) {
        private val mContext: Context = myContext

        companion object {

            @Volatile
            private var instance: SingletonModeTwo? = null

            fun getInstance(context: Context): SingletonModeTwo {
                val i = instance
                if (i != null) {
                    return i
                }
                return synchronized(this) {
                    val i2 = instance
                    if (i2 != null) {
                        i2
                    } else {
                        val i3 = SingletonModeTwo(context)
                        instance = i3
                        i3
                    }
                }
            }
        }

        fun showMsg(str: String) {
            println("SingletonModeTwo ---> showMsg：${str}")
        }
    }

    enum class SingletonModeThree{
        Instance;
        fun showMsg(str: String) {
            println("SingletonModeThree ---> showMsg：${str}")
        }
    }


    object SingletonModeFour {
        private var context: Context? = null
        fun init(context: Context?) {
            this.context = context
        }

        fun showMsg(str: String) {
            println("SingletonModeTwo ---> showMsg：${str}")
        }
    }

}