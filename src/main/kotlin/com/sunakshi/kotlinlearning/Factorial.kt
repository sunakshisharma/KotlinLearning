package com.sunakshi.kotlinlearning

fun calculateFact() {
    val num = 5
    var fact = 1
    if (num != 0) {
        for (i in 1..num) {
            fact *= i
        }
    }
    println("Factorial of $num is: $fact")
}

fun main() {
    calculateFact()
}



