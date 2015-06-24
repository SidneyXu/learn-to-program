package org.mrseasons.coffeetime.kotlin._20_high_order_function

import java.util.concurrent.locks.Lock

/**
 * Created by mrseasons on 2015/06/24.
 */
fun main(args: Array<String>) {

    //Function Literal Syntax
    val sum = { x: Int, y: Int -> x + y }

    val sum2: (Int, Int) -> Int = { x, y -> x + y }

    //  Closure
    //    var sum3 = 0
    //    ints filter {it > 0} forEach {
    //        sum3 += it
    //    }
    //    print(sum3)

    //  Extension Function Expressions
    val sum4 = fun Int.(other: Int): Int = this + other
    1.sum4(2)
    1 sum4 2
}

//  functions as parameters
fun lock<T>(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

//  Function Types
fun max<T>(collection: Collection<out T>, less: (T, T) -> Boolean): T? {
    var max: T? = null
    for (it in collection)
        if (max == null || less(max!!, it))
            max = it
    return max
}

