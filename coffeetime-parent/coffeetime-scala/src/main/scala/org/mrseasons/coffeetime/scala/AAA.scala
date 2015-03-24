package org.mrseasons.coffeetime.scala

/**
 * Created by mrseasons on 3/24/15.
 */
object AAA {

  def main(args: Array[String]) {

    val persons=List(new Person(name = "Jane",age = 18), new Person(name = "Peter",age = 20), new Person(name = "Anna",age = 15), new Person(name = "Andy",age = 22))
    val ages=for(p <- persons if p.age>20) yield p.age
    val names=persons filter(p=>p.age>20) map(p=>p.name)
    println(ages)
    println(names)



  }
}

class Person(val name:String, val age:Int){

}
