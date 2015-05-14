package org.mrseasons.coffeetime.scala._22_io

import java.net.URL

import sys.process._
import java.io.File

/**
 * Created by mrseasons on 2015/05/14.
 */
object ShellExample {

  def main(args: Array[String]) {
    "ls -al .." !

    val result = "ls -al .." !!


    "ls -al .." #| "grep sec" !

    "ls -al .." #> new File("outputs.txt") !

    "ls -al .." #>> new File("outputs.txt") !

    "grep sec" #< new File("outputs.txt") !

    "grep scala" #< new URL("http://www.stackoverflow.com") !
  }
}
