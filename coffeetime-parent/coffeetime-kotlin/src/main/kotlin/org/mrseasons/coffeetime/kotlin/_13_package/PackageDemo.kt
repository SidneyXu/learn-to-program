//  package
package org.mrseasons.coffeetime.kotlin._13_package

//  import
import hello
//import hello.*
import foo.info

//  alias
import foo.bar as b

/**
 * Created by mrseasons on 2015/06/05.
 */
//belongs to the package
fun baz() {
}

class Goo {}

fun main(args: Array<String>) {
    foo.info()
    //  if import foo.info
    info()

    //  default package
    hello()

    b.bar()
}