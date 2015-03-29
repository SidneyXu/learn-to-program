val multi2 = (multi _).curried
val times2 = multiply(2) _
println(add2(3)) //5
val conn2 = (connect _).curried
val connect21 = (connect2("abc")) _
var multi3 = multi2(5)
println(multi3(9)) //55

def add2 = adder(2, _: Int)

/**
 * Created by mrseasons on 2/9/15.
 */

//Partial Application
def adder(m: Int, n: Int): Int = m + n
println(times2(3)) //6

//Currying
def multi(m: Int, n: Int): Int = m * (n + 2)

def multiply(m: Int)(n: Int): Int = m * n
println(conn2("abc")) //<function1>

def connect(m: String, n: String, o: String) = m + n + o

def connect2(m: String)(n: String)(o: String) = m + n + o
println(connect21("def"))     //<function1>