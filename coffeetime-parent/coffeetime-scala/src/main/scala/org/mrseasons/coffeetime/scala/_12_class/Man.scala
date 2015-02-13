package org.mrseasons.coffeetime.scala._12_class

import java.util.Date

/**
 * Created by mrseasons on 2/12/15.
 */
//main constructor
class Man(val name: String, val age: Int, private var from: String = "USA", description: String = "none") {

  println("sentences in main constructor")

  //constructors
  //slave constructor
  def this(name: String) {
    this(name, 0)
  }

  def this(age: Int) {
    this("Default Name", age)
  }

  def this(){
    this("Default Name")
  }

}

class Woman private(val name: String, val age: Int) {
  def this(name: String) {
    this(name, 0)
  }
}