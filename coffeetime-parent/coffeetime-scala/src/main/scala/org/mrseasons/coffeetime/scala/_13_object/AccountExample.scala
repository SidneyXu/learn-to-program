package org.mrseasons.coffeetime.scala._13_object

/**
 * Created by mrseasons on 2/13/15.
 */
object AccountExample {

  def main(args: Array[String]) {
    def account1 = new Account(30)
    println(account1.id)
    println(Account.getInfo(account1))

    def account2 = new Account(10)
    println(account2.id)
    println(Account.getInfo(account2))

    def account3 = new Account(50)
    println(account3.id)
    println(Account.getInfo(account3))

    account1.id
    account1.id
    account1.id
    println(account1.id)

    //apply
    def account4 = Account(90)
    println(account4.id)
    println(Account.getInfo(account4))
  }
}
