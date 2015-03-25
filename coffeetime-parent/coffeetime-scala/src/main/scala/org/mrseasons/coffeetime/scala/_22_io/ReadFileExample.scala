package org.mrseasons.coffeetime.scala._22_io

import java.io.File

import scala.io.{StdIn, Source}

/**
 * Created by mrseasons on 2/16/15.
 */
object ReadFileExample {

  def main(args: Array[String]) {

  }

  def readline() {
    var source = Source.fromFile("coffeetime-scala/myfile.txt", "UTF-8")
    val lineIterator = source.getLines()
    for (l <- lineIterator) {
      println(l)
    }
    source.close()

    source = Source.fromFile("coffeetime-scala/myfile.txt", "UTF-8")
    val lines = source.getLines().toArray
    println(lines.toList)
    source.close()

    source = Source.fromFile("coffeetime-scala/myfile.txt", "UTF-8")
    val contents = source.mkString
    println(contents)
    source.close()
  }

  def readChar() {
    val source = Source.fromFile("coffeetime-scala/myfile.txt", "UTF-8")
    for (c <- source) {
      print(c)
    }
    source.close()
  }

  def readConsole(): Unit = {
    val result = StdIn.readLine()
    println(result)
  }

  def readOther(): Unit = {
    val source1 = Source.fromURL("http://www.baidu.com")
    val source2 = Source.fromString("hello world")
    println(source1.mkString)
    println(source2.mkString)
  }
}
