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
def six(): Int = {
  val x = 2 + 3
  val y = 3 + 2
  x + y
}

//call functions
//println(five()) error
println(five)
println(six)
println(six())


//default arguments and arguments with specified names
def decorate(str: String, left: String = "[", right: String = "]") = left + str + right
println(decorate("abc")) //[abc]
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

//println(capitalizeAll("a" to "c"))	//error
//println(capitalizeAll("a" to "c": _*)   ???


//anonymous function
val add = (x: Int) => x + 1
println(add(3))