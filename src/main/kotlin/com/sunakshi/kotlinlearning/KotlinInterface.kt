package com.sunakshi.kotlinlearning

interface A{
    fun show()
    fun abc(){
        println("A: Output of abc")
    }
}
interface B{
    fun display()
    fun abc(){
        println("B: Output of abc")
    }
}
class C :A,B{
    override fun show() {
        println("Show of A")
    }
    override fun display() {
        println("Display of B")
    }
    override fun abc(){
//        println("C: Output of abc")
        super<A>.abc()
    }
}

fun main() {
    val obj = C()
    obj.show()
    obj.display()
    obj.abc()
}