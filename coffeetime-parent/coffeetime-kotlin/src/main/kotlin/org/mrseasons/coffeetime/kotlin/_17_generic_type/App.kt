package org.mrseasons.coffeetime.kotlin._17_generic_type

/**
 * Created by mrseasons on 2015/06/09.
 */
fun main(args: Array<String>) {

    var strHolder = Holder<String>("a")
    var intHolder = Holder<Int>(3)
    strHolder.info()    //  a
    intHolder.info()    //  3


}
