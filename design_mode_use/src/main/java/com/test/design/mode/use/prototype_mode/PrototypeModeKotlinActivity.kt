package com.test.design.mode.use.prototype_mode

import android.app.Activity
import android.os.Bundle
import com.test.design.mode.use.R

/**
 * Description: 原型模式——kotlin实现
 */
class PrototypeModeKotlinActivity : Activity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prototype_mode)

//        shallowClone()
//        useDataClass()
        deepClone()
    }

    /**
     * 浅克隆
     */
    private fun shallowClone(){
        val p1 = PersonForKotlin()
        p1.name = "张三"
        p1.age = 24
        p1.weight = 133.12
        p1.hobbyList.add("跳水")
        p1.hobbyList.add("滑冰")
        p1.hobbyList.add("体操")
        val address1 = AddressForKotlin()
        address1.myAddress = "湖北省武汉市"
        p1.address = address1

        val p2 = p1.clone() as PersonForKotlin
        println("p1：$p1")
        println("p2：$p2")
        println("p1 ---> " + p1.showAll())
        println("p2 ---> " + p2.showAll())
        println("p1.hobbyList === p2.hobbyList：" + (p1.hobbyList === p2.hobbyList))
        println("p1.hobbyList == p2.hobbyList：" + (p1.hobbyList == p2.hobbyList))
        println("p1.address == p2.address：" + (p1.address == p2.address))
        println("p1.address === p2.address：" + (p1.address === p2.address))

        println("-------------")

        p2.name = "李四"
        p2.age = 28
        p2.weight = 136.78
        p2.hobbyList.add("游泳")
        address1.myAddress = "湖北省宜昌市"
        p2.address = address1
        println("p1 ---> " + p1.showAll())
        println("p2 ---> " + p2.showAll())
    }

    private fun useDataClass(){
        val hList = arrayListOf("射击","马术","击剑")
        val addr = AddressForKotlin()
        addr.myAddress = "蜀国"
        val myDataClass1 = MyDataClass("赵云",31,153.66, hList,addr)
        val myDataClass2 = myDataClass1.copy()

        println("myDataClass1 === myDataClass2：${myDataClass1 === myDataClass2}")
        println("myDataClass1：${myDataClass1.showAll()}")
        println("myDataClass2：${myDataClass2.showAll()}")
        println("myDataClass1.hobbyList === myDataClass2.hobbyList：" + (myDataClass1.hobbyList === myDataClass2.hobbyList))
        println("myDataClass1.hobbyList == myDataClass2.hobbyList：" + (myDataClass1.hobbyList == myDataClass2.hobbyList))
        println("myDataClass1.address == myDataClass2.address：" + (myDataClass1.address == myDataClass2.address))
        println("myDataClass1.address === myDataClass2.address：" + (myDataClass1.address === myDataClass2.address))

        println("-------------")

        myDataClass2.name = "陆逊"
        myDataClass2.age = 38
        myDataClass2.weight = 145.91
        myDataClass2.hobbyList.add("火攻")
        addr.myAddress = "吴国"
        myDataClass2.address = addr
        println("myDataClass1：${myDataClass1.showAll()}")
        println("myDataClass2：${myDataClass2.showAll()}")
    }

    /**
     * 深克隆
     */
    private fun deepClone(){
        val p3 = PersonForKotlin()
        p3.name = "张三"
        p3.age = 24
        p3.weight = 133.12
        p3.hobbyList.add("跳水")
        p3.hobbyList.add("滑冰")
        p3.hobbyList.add("体操")
        val address1 = AddressForKotlin()
        address1.myAddress = "湖北省武汉市"
        p3.address = address1

        val p4 = p3.clone() as PersonForKotlin
        println("p3：$p3")
        println("p4：$p4")
        println("p3 ---> " + p3.showAll())
        println("p4 ---> " + p4.showAll())
        println("p3.hobbyList == p4.hobbyList：" + (p3.hobbyList === p4.hobbyList))
        println("p3.address == p4.address：" + (p3.address === p4.address))

        println("-------------")

        p4.name = "李四"
        p4.age = 28
        p4.weight = 136.78
        p4.hobbyList.add("游泳")
        p4.address.myAddress = "湖北省宜昌市"
        println("p3 ---> " + p3.showAll())
        println("p4 ---> " + p4.showAll())
    }
}