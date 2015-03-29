package org.mrseasons.coffeetime.scala._13_object

/**
 * Created by mrseasons on 2/13/15.
 */
class Account(private var balance: Int = 0) {
  val id = Account.sequence()
}

object Account {
  private var num = 0

  def getInfo(account: Account): String = {
    "balance is " + account.balance
  }

  def apply(initBalance: Int) = {
    new Account(initBalance)
  }

  private def sequence(): Int = {
    num += 1
    num
  }
}