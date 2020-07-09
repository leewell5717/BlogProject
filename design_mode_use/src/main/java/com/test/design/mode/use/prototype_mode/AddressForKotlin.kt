package com.test.design.mode.use.prototype_mode

class AddressForKotlin: Cloneable {

    var myAddress : String? = null

    public override fun clone(): Any {
        return super.clone()
    }
}