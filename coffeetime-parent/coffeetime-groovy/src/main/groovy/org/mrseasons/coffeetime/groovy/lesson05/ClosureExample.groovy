package org.mrseasons.coffeetime.groovy.lesson05
/**
 * Created by mrseasons on 2015/1/29.
 */
class ClosureExample {
    static void main(args) {
        //lazy execute
        def excite={word->
            return "$word!"
        }

        excite("Groovy")
        excite.call("Java")
    }

}
