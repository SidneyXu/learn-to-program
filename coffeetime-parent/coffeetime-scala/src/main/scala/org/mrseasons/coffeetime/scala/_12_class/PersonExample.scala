package org.mrseasons.coffeetime.scala._12_class

/**
 * Created by mrseasons on 2/12/15.
 */
object PersonExample {
  def main(args: Array[String]) {
    val person = new Person
    person.age = 10     //person.age_=(10)
    println(person.age) //person.age()

    person.trueAge = 20
    person.trueAge = 14
    println(person.trueAge)
  }
}
