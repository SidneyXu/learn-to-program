package org.mrseasons.coffeetime.scala._13_object

/**
 * Created by mrseasons on 2/13/15.
 */
object DoNothing extends UndoableAction("Do nothing") {

  override def undo: Unit = ???

  override def redo: Unit = ???

  def main(args: Array[String]) {
    val actions = Map("open" -> DoNothing, "save" -> DoNothing)
  }
}
