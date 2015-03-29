import java.util.Date
import math._;

lazy val lazyWords = ("a", "b", "c", Math.random())
val two: Int = 2
val three = 3
//loading mechanism
val words = ("a", "b", "c", Math.random())
/**
 * Created by mrseasons on 2/6/15.
 */
//definition
var name: String = "Jack"
var lastName = "Peter"

def newWords = ("a", "b", "c", Math.random())

println("words", words) //(words,(a,b,c,0.9433242704721396))
println("words", words) //(words,(a,b,c,0.9433242704721396))
println("words", words) //(words,(a,b,c,0.9433242704721396))

println("lazyWords", lazyWords) //(lazyWords,(a,b,c,0.38060170145565875))
println("lazyWords", lazyWords) //(lazyWords,(a,b,c,0.38060170145565875))
println("lazyWords", lazyWords) //(lazyWords,(a,b,c,0.38060170145565875))

println("newWords", newWords) //(newWords,(a,b,c,0.946821735977215))
println("newWords", newWords) //(newWords,(a,b,c,0.9000251147436494))
println("newWords", newWords) //(newWords,(a,b,c,0.22574002682293237))

//call-by-name
def sum(x: Double, y: Double) = square(x) + square(y)

def square(x: Double) = x * x
println(sum(3, 2 + 2)) //25.0

//call-by-value
def sum2(x: Double, y: => Double) = square(x) + square(y)
println(sum2(3, 2 + 2)) //25.0

//difference between call-by-name and call-by-value
def loop: Int = loop * 1
def constOne(x: Int, y: => Int) = 1

println(constOne(1, loop)) //1
//println(constOne(loop, 1))  //loop forever