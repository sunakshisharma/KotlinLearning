package com.sunakshi.kotlinlearning


open class Human(age :Int) {

    init {
        println("In Human $age" )
    }
    open fun think() {
        println("Real Thinking")
    }
    fun think1() {
        println("Real Thinking1")
    }
}

class Alien1(age: Int):Human(age) {

    init {
        println("In Alien1")
    }
    override fun think() {
        println("Virtual Thinking")
    }
}

fun main() {
    val sam : Human = Alien1(20)
    sam.think()
    sam.think1()
}