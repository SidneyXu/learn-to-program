package org.mrseasons.coffeetime.scala._03_var_val_expression

import _root_.kotlin.jvm.functions

/**
 * Created by mrseasons on 2015/06/06.
 */
object VariableExample extends App {

  //definition
  //variable
  var name: String = "Jack"

  //constant
  val two: Int = 2

  //type interfere
  var lastName = "Peter"
  val three = 3

  //face expression
  val brand = "HP"
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }
  println(color)
Function2

  //loading mechanism
  def newWords = ("a", "b", "c", Math.random())

  lazy val lazyWords = ("a", "b", "c", Math.random())
  val words = ("a", "b", "c", Math.random())

  println("words", words) //(words,(a,b,c,0.9433242704721396))
  println("words", words) //(words,(a,b,c,0.9433242704721396))
  println("words", words) //(words,(a,b,c,0.9433242704721396))

  println("lazyWords", lazyWords) //(lazyWords,(a,b,c,0.38060170145565875))
  println("lazyWords", lazyWords) //(lazyWords,(a,b,c,0.38060170145565875))
  println("lazyWords", lazyWords) //(lazyWords,(a,b,c,0.38060170145565875))

  println("newWords", newWords) //(newWords,(a,b,c,0.946821735977215))
  println("newWords", newWords) //(newWords,(a,b,c,0.9000251147436494))
  println("newWords", newWords) //(newWords,(a,b,c,0.22574002682293237))

}
