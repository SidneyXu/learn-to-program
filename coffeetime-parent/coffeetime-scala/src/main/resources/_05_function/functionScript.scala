/**
 * Created by mrseasons on 2015/2/9.
 */

//define functions
def addOne(m: Int): Int = m + 1
def addTwo(m: Int): Int = {
  m + 2
}


//call functions
//function contains ()
def five: Int = {
  val x = 2 + 3
  val y = 3 + 2
  x + y
}
//println(five())   //error
println(five)

//function not contains ()
def six(): Int = {
  val x = 2 + 3
  val y = 3 + 2
  x + y
}
println(six)
println(six())


//default arguments and arguments with specified names
//default arguments
def decorate(str: String, left: String = "[", right: String = "]") = left + str + right
println(decorate("abc")) //[abc]

// parameters with specified names
println(decorate("abc", right = ">")) //[abc>


//varargs
def capitalizeAll(args: String*) = {
  args.map { arg =>
    arg.capitalize
  }
}
println(capitalizeAll("abc", "def")) //ArrayBuffer(Abc, Def)
println(capitalizeAll("abc")) //ArrayBuffer(Abc)
println(capitalizeAll()) //List()

//use list as varargs
def list = List("abc", "zxc")
println(capitalizeAll(list: _*)) //List(Abc, Zxc)


//sub
def box(s: String) {
  println(s)
}
box("abc")

//  value function
def abc(s: String) = {
  println(s)
}
val xyz = abc _ //  xyz is a value function
abc("abc")  //  abc
xyz("xyz")  //  xyz


//anonymous function
val add = (x: Int) => x + 1
println(add(3)) //4

val addOri = {
  def f(x: Int) = x + 1
  f _
}
println(addOri(5)) //6


//Nested Functions
def closeTo(src: Double, target: Int): Double = {
  def isGoodEnough(guess: Double): Boolean = {
    target - guess < 0.1
  }
  def add(guess: Double): Double = {
    guess + 0.01
  }
  def improve(guess: Double): Double = {
    if (isGoodEnough(guess)) guess
    else improve(add(guess))
  }
  improve(src)
}
println(closeTo(1.2, 5)) //4.900999999999993


//pass parameters
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

