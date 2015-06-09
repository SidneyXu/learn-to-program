package org.mrseasons.coffeetime.scala._17_generic_type

/**
 * Created by mrseasons on 2015/05/08.
 */
object HolderExample {

  def main(args: Array[String]) {
    //---default, without covariant---
    var strHolder = new Holder[String]("a")
    var intHolder = new Holder[Int](3)
    strHolder.info // a
    intHolder.info // 3

    var anyHolder = new Holder[AnyRef]("b")
    anyHolder.info //b

    //wrong, Holder[String] isn't the subclass of Holder[AnyRef] by default
    //    anyHolder=intHolder
    //    anyHolder=strHolder

    //---using co-variant----
    var strCo = new CovariantHolder[String]("a")
    var intCo = new CovariantHolder[Int](3)
    var anyCo = new CovariantHolder[AnyRef]("b")

    //wrong, Int isn't the subclass of AnyRef
    //    anyCo=intCo
    anyCo = strCo
    anyCo.info //a

    //---using contravariant---
    var strDCo = new ContravarintHolder[String]("a")
    var intDCo = new ContravarintHolder[Int](3)
    var anyDCo = new ContravarintHolder[AnyRef]("b")

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
