package org.mrseasons.coffeetime.groovy

/**
 * Created by mrseasons on 2015/1/31.
 */
class ABC {
    def name

    static void main(args) {
        println "123"
        println """
afaf
afafsfaf''""af
fafafa<faf>f
"""

        Process p = "mvn archetype:generate".execute()

        println "${p.text}"
    }
}
