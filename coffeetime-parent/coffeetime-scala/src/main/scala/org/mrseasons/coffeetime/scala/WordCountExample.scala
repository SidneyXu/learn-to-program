package org.mrseasons.coffeetime.scala

/**
 * Created by mrseasons on 4/3/15.
 */
object WordCountExample {
  def main(args: Array[String]) {
    val file = List("warn 2013 msg", "warn 2012 msg",
      "error 2013 msg msg", "warn 2013 msg")

    def wordcount(str: String): Int = str.split(" ").count("msg" == _)

    val num = file.map(wordcount).reduceLeft(_ + _)

    println("wordcount:" + num)



    def cc(str:String):Int= str.split(" ").count(_ =="msg")
    val nnum = file.map(wordcount).reduceLeft((m,n)=>{println(n,m); m})

    println("wordcount:" + nnum)
  }
}
