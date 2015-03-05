import java.util.Date
import math._;

/**
 * Created by mrseasons on 2/6/15.
 */
//definition
var name: String = "Jack"
val two: Int = 2

var lastName = "Peter"
val three = 3

//? loading mechanism
val words = ("a", "b", "c", new Date().getTime)
lazy val lazyWords = ("a", "b", "c", new Date().getTime)
def newWords = ("a", "b", "c", new Date().getTime)
Thread.sleep(3000)

println(words)
println(lazyWords)
println(newWords)

Thread.sleep(3000)

println(words)
println(lazyWords)
println(newWords)


def square(x: Double) = x * x

//call-by-name
def sum(x: Double, y: Double) = square(x) + square(y)
println(sum(3, 2 + 2)) //25.0

//call-by-value
def sum2(x: Double, y: => Double) = square(x) + square(y)
println(sum2(3, 2 + 2)) //25.0

//difference between call-by-name and call-by-value
def loop: Int = loop * 1
def constOne(x: Int, y: => Int) = 1

println(constOne(1, loop))  //1
//println(constOne(loop, 1))  //loop forever