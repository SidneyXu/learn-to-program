package foo.bar

import foo.info

//  import foo.privateInfo

/**
 * Created by mrseasons on 2015/06/05.
 */
fun bar() {
    println("package foo.bar")

    info()

    //  also cannot access private members from parent packages
    //  privateInfo()
}