package org.mrseasons.coffeetime.groovy.groovyjava

/**
 * Created by mrseasons on 2015/2/2.
 */
class GroovyCallJava {

    static void main(args) {
        JavaBean bean = new JavaBean("Peter")
        println bean.getName()

        GroovyBean groovyBean = new GroovyBean(name: "Peter")
        println groovyBean.name
    }
}
