package com.sunakshi.kotlinlearning

data class Laptop(val brand:String,val price:Int){
}

fun main() {
    val lap1 =Laptop("Dell",2000)
    val lap2 =Laptop("Apple",2500)
    val lap3 = lap1.copy(price = 2500)

    println(lap3)
    println(lap1 == lap2)
}