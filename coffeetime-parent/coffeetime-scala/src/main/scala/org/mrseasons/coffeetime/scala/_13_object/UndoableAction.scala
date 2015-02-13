package org.mrseasons.coffeetime.scala._13_object

/**
 * Created by mrseasons on 2/13/15.
 */
abstract class UndoableAction(val description: String) {
  def undo

  def redo
}
