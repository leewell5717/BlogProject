package com.test.design.mode.use.singleton_mode

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.test.design.mode.use.R

/**
 * 单例模式Activity
 */
class SingletonModeActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singleton_mode)

        val javaSingletonOneBtn : Button = findViewById(R.id.javaSingletonOneBtn)
        javaSingletonOneBtn.setOnClickListener {
            val singleton1 = SingletonModeForJava.SingletonModeOne.getInstance()
            val singleton2 = SingletonModeForJava.SingletonModeOne.getInstance()
            println("singleton1：${singleton1}")
            println("singleton2：${singleton2}")
            println("singleton1 == singleton2：${singleton1 == singleton2}")
            println("singleton1 === singleton2：${singleton1 === singleton2}")
            SingletonModeForJava.SingletonModeOne.getInstance().showMsg("java-饿汉式单例")
        }

        val javaSingletonTwoBtn : Button = findViewById(R.id.javaSingletonTwoBtn)
        javaSingletonTwoBtn.setOnClickListener {
            val singleton3 = SingletonModeForJava.SingletonModeTwo.getInstance()
            val singleton4 = SingletonModeForJava.SingletonModeTwo.getInstance()
            println("singleton3：${singleton3}")
            println("singleton4：${singleton4}")
            println("singleton3 == singleton4：${singleton3 == singleton4}")
            println("singleton3 === singleton4：${singleton3 === singleton4}")
            SingletonModeForJava.SingletonModeTwo.getInstance().showMsg("java-懒汉式单例")
        }

        val javaSingletonThreeBtn : Button = findViewById(R.id.javaSingletonThreeBtn)
        javaSingletonThreeBtn.setOnClickListener {
            val singleton5 = SingletonModeForJava.SingletonModeThree.getInstance()
            val singleton6 = SingletonModeForJava.SingletonModeThree.getInstance()
            println("singleton5：${singleton5}")
            println("singleton6：${singleton6}")
            println("singleton5 == singleton6：${singleton5 == singleton6}")
            println("singleton5 === singleton6：${singleton5 === singleton6}")
            SingletonModeForJava.SingletonModeThree.getInstance().showMsg("java-双重验证锁单例")
        }

        val javaSingletonFourBtn : Button = findViewById(R.id.javaSingletonFourBtn)
        javaSingletonFourBtn.setOnClickListener {
            val singleton7 = SingletonModeForJava.SingletonModeFour.getInstance()
            val singleton8 = SingletonModeForJava.SingletonModeFour.getInstance()
            println("singleton7：${singleton7}")
            println("singleton8：${singleton8}")
            println("singleton7 == singleton8：${singleton7 == singleton8}")
            println("singleton7 === singleton8：${singleton7 === singleton8}")
            SingletonModeForJava.SingletonModeFour.getInstance().showMsg("java-静态内部类单例")
        }
        val javaSingletonFiveBtn : Button = findViewById(R.id.javaSingletonFiveBtn)
        javaSingletonFiveBtn.setOnClickListener {
            val singleton9 = SingletonModeForJava.SingletonModeFive.singletonModeFive
            val singleton10 = SingletonModeForJava.SingletonModeFive.singletonModeFive
            println("singleton9：${singleton9}")
            println("singleton10：${singleton10}")
            println("singleton9 == singleton10：${singleton9 == singleton10}")
            println("singleton9 === singleton10：${singleton9 === singleton10}")
            SingletonModeForJava.SingletonModeFive.singletonModeFive.showMsg("java-枚举单例")
        }

        val kotlinSingletonOneBtn : Button = findViewById(R.id.kotlinSingletonOneBtn)
        kotlinSingletonOneBtn.setOnClickListener {
            val singleton1 = SingletonModeForKotlin.SingletonModeOne
            val singleton2 = SingletonModeForKotlin.SingletonModeOne
            println("singleton1：${singleton1}")
            println("singleton2：${singleton2}")
            println("singleton1 == singleton2：${singleton1 == singleton2}")
            println("singleton1 === singleton2：${singleton1 === singleton2}")
            SingletonModeForKotlin.SingletonModeOne.showMsg("kotlin-单例")
        }

        val kotlinSingletonTwoBtn : Button = findViewById(R.id.kotlinSingletonTwoBtn)
        kotlinSingletonTwoBtn.setOnClickListener {
            val singleton3 = SingletonModeForKotlin.SingletonModeTwo.getInstance(this)
            val singleton4 = SingletonModeForKotlin.SingletonModeTwo.getInstance(this)
            println("singleton3：${singleton3}")
            println("singleton4：${singleton4}")
            println("singleton3 == singleton4：${singleton3 == singleton4}")
            println("singleton3 === singleton4：${singleton3 === singleton4}")
            SingletonModeForKotlin.SingletonModeTwo.getInstance(this).showMsg("kotlin-带参数的单例")
        }

        val kotlinSingletonThreeBtn : Button = findViewById(R.id.kotlinSingletonThreeBtn)
        kotlinSingletonThreeBtn.setOnClickListener {
            val singleton5 = SingletonModeForKotlin.SingletonModeThree.Instance
            val singleton6 = SingletonModeForKotlin.SingletonModeThree.Instance
            println("singleton5：${singleton5}")
            println("singleton6：${singleton6}")
            println("singleton5 == singleton6：${singleton5 == singleton6}")
            println("singleton5 === singleton6：${singleton5 === singleton6}")
            SingletonModeForKotlin.SingletonModeThree.Instance.showMsg("kotlin-枚举单例")
        }


    }
}