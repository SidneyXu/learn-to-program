package org.mrseasons.coffeetime.groovy._02_03_type_scope_script


/**
 * Created by mrseasons on 2015/2/5.
 */
class ScopeBinder {

    static void main(args) {
        def scope = new scopeSciprt()

        scope.run()
        println ""

        scope.binding.hello = "goodbye"       //bing scope not exist
        scope.binding.helloworld = "hello groovy"
        scope.check()
        println ""

        scope.run()
    }
}
