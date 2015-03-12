package org.mrseasons.coffeetime.scala._17_generic_type

/**
 * Created by mrseasons on 3/12/15.
 */
object StackExample {

  def main(args: Array[String]) {
    val x = new EmptyStack[Int]
    val y = x.push(1).push(2)
    println(y.pop.top) //1

    val s1 = new EmptyStack[String].push("abc")
    val s2 = new EmptyStack[String].push("abx").push(s1.top)
    println(isPrefix[String](s1, s2)) //true


  }

  def isPrefix[A](p: Stack[A], s: Stack[A]): Boolean = {
    p.isEmpty || p.top == s.top && isPrefix[A](p.pop, s.pop)
  }
}
