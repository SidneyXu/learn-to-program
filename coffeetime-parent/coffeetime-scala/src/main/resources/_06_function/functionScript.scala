//anonymous function
val add = (x: Int) => x + 1

/**
 * Created by mrseasons on 2/9/15.
 */

//block and function
//define functions
def addOne(m: Int): Int = m + 1

def addTwo(m: Int): Int = {
  m + 2
}

def five: Int = {
  val x = 2 + 3
  val y = 3 + 2
  x + y
}

//call functions
//println(five()) error
println(five)
println(six)
println(six())

def six(): Int = {
  val x = 2 + 3
  val y = 3 + 2
  x + y
}
println(decorate("abc")) //[abc]
println(decorate("abc", right = ">")) //[abc>

//default arguments and arguments with specified names
def decorate(str: String, left: String = "[", right: String = "]") = left + str + right
println(capitalizeAll("abc", "def")) //ArrayBuffer(Abc, Def)
println(capitalizeAll("abc")) //ArrayBuffer(Abc)
println(capitalizeAll()) //List()

//println(capitalizeAll("a" to "c"))	//error
//println(capitalizeAll("a" to "c": _*)   ???

//varargs
def capitalizeAll(args: String*) = {
  args.map { arg =>
    arg.capitalize
  }
}
println(add(3)) //4

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

//anonymous functions
val aaa = (x: Int) => x + 1
val bbb = {
  def f(x: Int) = x + 1; f _
}
println(aaa(1))
println(bbb(3))