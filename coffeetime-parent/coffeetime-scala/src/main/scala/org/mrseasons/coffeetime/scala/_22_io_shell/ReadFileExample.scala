package org.mrseasons.coffeetime.scala._22_io

import scala.io.{Source, StdIn}

/**
 * Created by mrseasons on 2015/05/14.
 */
object ReadFileExample extends App {

  def readLine() {
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

  def readUrl(): Unit = {
    val source1 = Source.fromURL("http://www.stackoverflow.com", "UTF-8")
    println(source1.mkString)
    source1.close()
  }

  def readString(): Unit = {
    val source2 = Source.fromString("hello world")
    println(source2.mkString)
    source2.close()
  }
}
