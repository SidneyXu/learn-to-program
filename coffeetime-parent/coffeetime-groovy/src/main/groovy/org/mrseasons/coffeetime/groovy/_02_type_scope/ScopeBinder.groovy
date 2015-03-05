package org.mrseasons.coffeetime.groovy._02_type_scope


/**
 * Created by mrseasons on 2/5/15.
 */
class ScopeBinder {

    static void main(args) {
        def scope = new scopeSciprt()

        scope.run()
        println ""

        scope.binding.hello = "goodbye"       //不存在此绑定域
        scope.binding.helloworld = "hello groovy"
        scope.check()
        println ""

        scope.run()
    }
}
