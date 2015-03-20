package org.mrseasons.coffeetime.scala._17_generic_type

import java.util.Date

/**
 * Created by mrseasons on 3/20/15.
 */
object HolderExample {

  def main(args: Array[String]) {
    //default
    var strHolder = new Holder[String]("a");
    var intHolder = new Holder[Int](3)
    strHolder.info //a
    intHolder.info //3

    var anyHolder = new Holder[AnyRef]("b")
    anyHolder.info //b

    //    anyHolder=intHolder
    //    anyHolder=strHolder

    //using co-variant
    var strCo = new CoHolder[String]("a")
    var intCo = new CoHolder[Int](3)
    var anyCo = new CoHolder[AnyRef]("b")

    //wrong
    //    anyCo=intCo
    anyCo = strCo
    anyCo.info //a

    //using contravariant
    var strDCo = new DcoHolder[String]("a")
    var intDCo = new DcoHolder[Int](3)
    var anyDCo = new DcoHolder[AnyRef]("b")

    //    wrong
    //    anyDCo = strDCo
    strDCo = anyDCo
    strDCo.info //b


    //co-variant in java
    //in java, not safety, using run-time check
    //    Date[] dateArr = new Date[2];
    //    Object[] objectArr = dateArr;
    //    objectArr[0] = "str";

    //in scala, using compile check
    //    val x = new Array[String](1)
    //    val y: Array[Any] = x

  }
}
