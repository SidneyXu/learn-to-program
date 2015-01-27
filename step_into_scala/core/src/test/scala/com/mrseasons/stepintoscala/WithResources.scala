package com.mrseasons.stepintoscala

import java.net.URL
import java.nio.file.Paths
import java.util.Scanner
<<<<<<< HEAD
import org.junit.Test
=======

>>>>>>> 6cc0713649807ca98d599567466465e1047db666

import scala.reflect.io.File


/**
 * Created by mrseasons on 15-1-25.
 */
object WithResources {

  def main(args: Array[String]) {
//    withScanner(File("proc/self/stat"),
//      scanner => println("pid is " + scanner.next()))

    withScanner(File("ab"), new Scanner("afa"))
  }

  def withScanner(f: File, op: Scanner => Unit) = {
    val scanner = new Scanner(f.bufferedReader)
        try {
      op(scanner)
    } finally {
      scanner.close()
    }
  }

}
