/**
 * Created by mrseasons on 1/27/15.
 */

//---创建函数---
def addOne(m: Int): Int = m + 1
def addTwo(m: Int): Int = {
  m + 2
}

//---调用函数---
//省略()
def three = 1 + 2
println(three) //3
//println(three())  error

//无需参数
def four() = 1 + 3
println(four()) //4
println(four) //4

//完整调用
println(addOne(3)) //4


//---匿名函数---
var addThree = (x: Int) => x + 3
println(addThree(2)) //5


//---Partial application---
def adder(m: Int, n: Int): Int = m + n
def add2 = adder(2, _: Int)
println(add2(3)) //5

//---currying---
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
val connect21 = (connect2("abc")) _
println(connect21("def")) //<function1>

//variable arguments
def capitalizeAll(args: String*) = {
  args.map { arg =>
    arg.capitalize
  }
}
println(capitalizeAll("abc", "def")) //ArrayBuffer(Abc, Def)
println(capitalizeAll("abc")) //ArrayBuffer(Abc)
println(capitalizeAll()) //List()


