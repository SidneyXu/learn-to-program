package org.mrseasons.coffeetime.scala._16_case_class_match_pattern

/**
 * Created by mrseasons on 3/11/15.
 */
abstract class Expr {
  def eval: Int

  def calc: Int = this match {
    case Number(n) => n
    case Sum(e1, e2) => e1.eval + e2.eval
  }
}

case class Number(n: Int) extends Expr {
  var comment: String = "comment"

  def eval: Int = n
}

case class Sum(e1: Expr, e2: Expr) extends Expr {
  var comment: String = "comment"

  def eval: Int = e1.eval + e2.eval
}
