package com.test.design.mode.use.prototype_mode

data class MyDataClass(var name: String, var age: Int, var weight: Double, var hobbyList: ArrayList<String>, var address: AddressForKotlin){
    fun showAll() : String{
        return "name： $name，age： $age，weight： $weight，hobbyList ：$hobbyList，address： ${address.myAddress}";
    }
}