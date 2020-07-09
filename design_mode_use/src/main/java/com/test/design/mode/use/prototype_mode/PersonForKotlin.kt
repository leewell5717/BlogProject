package com.test.design.mode.use.prototype_mode

class PersonForKotlin : Cloneable {

    var name: String? = null
    var age: Int? = null
    var weight: Double? = null

    var address = AddressForKotlin()
    var hobbyList = arrayListOf<String>()

    fun showAll() : String{
        return "name: " + name + "，age： " + age + "，weight： " + weight + "，hobbyList： " + hobbyList + "，address： " + address.myAddress;
    }

    public override fun clone(): Any {
        var tempPerson = PersonForKotlin()
        try {
            tempPerson = super.clone() as PersonForKotlin
            tempPerson.address = address.clone() as AddressForKotlin
            tempPerson.hobbyList = hobbyList.clone() as ArrayList<String>
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return tempPerson

//        return super.clone()
    }
}