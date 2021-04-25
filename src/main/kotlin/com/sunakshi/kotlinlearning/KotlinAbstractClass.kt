package com.sunakshi.kotlinlearning


abstract class Human1{
    abstract fun think()

    fun talk() {
        println("talking")
    }
}

class Doctor:Human1() {
    override fun think() {
        println("Critical Thinking")
    }
}
class Alien2:Human1() {
    override fun think() {
        println("Virtual Thinking")
    }
}

fun main() {
    val sam : Human1 = Alien2()
    sam.think()
    sam.talk()
}