
/**
 * Created by mrseasons on 2015/2/9.
 */

//Partial Application
def adder(m: Int, n: Int): Int = m + n
def add2 = adder(2, _: Int)
println(add2(3)) //5


//Currying
def multi(m: Int, n: Int): Int = m * (n + 2)
val multi2 = (multi _).curried
var multi3 = multi2(5)
println(multi3(9)) //55

def multiply(m: Int)(n: Int): Int = m * n
val times2 = multiply(2) _
println(times2(3)) //6

def connect(m: String, n: String, o: String) = m + n + o
val conn2 = (connect _).curried
println(conn2("abc")) //<function1>

def connect2(m: String)(n: String)(o: String) = m + n + o
val connect21 = connect2("abc") _
println(connect21("def")) //<function1>