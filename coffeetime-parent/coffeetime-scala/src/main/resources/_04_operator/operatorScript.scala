/**
 * Created by mrseasons on 2/9/15.
 */

//everything is object
var answer = 1 + 2
answer = 1.+(2)

//abbreviated method
class A {
  def dou(x: Int): Int = {
    x * x
  }
}

def a: A = new A()
println(a.dou(3))
println(a dou 3) //abbreviated

//++
var counter = 0
//counter++   error
counter += 1

