package org.mrseasons.coffeetime.groovy._02_03_type_scope_script

/**
 * Created by mrseasons on 3/20/15.
 */
def scope = new scopeSciprt()

println "---start scopeScript---"
scope.run()
println ""

scope.binding.hello = "goodbye"       //the binding scope not exist
scope.binding.helloworld = "hello groovy"
scope.check()

println "---start scopeScript---"
scope.run()

println "---start typeScript---"
scope = new typeScript()
scope.run()
