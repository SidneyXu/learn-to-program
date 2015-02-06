import org.mrseasons.coffeetime.groovy._23_groovy_java.GroovyBean
import org.mrseasons.coffeetime.groovy._23_groovy_java.JavaBean

/**
 * Created by mrseasons on 2/6/15.
 */
class GroovyCallJava {

    static void main(args) {
        JavaBean javaBean = new JavaBean("Peter")
        println javaBean.getName()
        println javaBean.calc(2, 3)

        GroovyBean groovyBean = new GroovyBean(name: "Peter")
        println groovyBean.name
        println groovyBean.calc(2, 3)
    }
}
