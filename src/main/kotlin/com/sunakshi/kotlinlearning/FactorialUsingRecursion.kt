package com.sunakshi.kotlinlearning

import java.math.BigInteger

tailrec fun fact(num: BigInteger,result:BigInteger): BigInteger {

    return if (num != BigInteger.ZERO) {
         fact(num - BigInteger.ONE,num*result)
    }
    else
        result
}

fun main() {

   println(fact(BigInteger("70000"),BigInteger.ONE))
}


//#5* 4* 3 * 2* 1 * fact(0)


//5,1  4,5  3,20  2,60 1,120