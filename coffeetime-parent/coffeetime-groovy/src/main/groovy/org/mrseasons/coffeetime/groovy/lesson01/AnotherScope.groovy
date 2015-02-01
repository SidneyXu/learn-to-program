package org.mrseasons.coffeetime.groovy.lesson01

/**
 * Created by mrseasons on 2015/2/1.
 */
class AnotherScope {

    static void main(args) {
        def scopeE = new scopeExample()

        //error
//        scopeE.check()

        scopeE.run()

        scopeE.binding.helloworld = "hello groovy"
        scopeE.check()
    }
}
