package org.mrseasons.coffeetime.scala._14_inherit

/**
 * Created by mrseasons on 2015/05/01.
 */
object DuckExample {

  def main(args: Array[String]) {
    val conn: Connection = new Connection()
    withClose(conn, conn =>
      println("do something with Connection"))

    //outputs:
    //    do something with Connection
    //    close Connection
  }

  def withClose(closeAble: {def close(): Unit},
                op: {def close(): Unit} => Unit) {
    try {
      op(closeAble)
    } finally {
      closeAble.close()
    }
  }

  class Connection {
    def close() = println("close Connection")
  }

}
