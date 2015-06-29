package org.mrseasons.coffeetime.kotlin._23_java

import java.util.ArrayList

/**
 * Created by mrseasons on 2015/06/29.
 */
//  Java Interop
fun main(args: Array<String>) {
    //  Calling Java code from Kotlin
    val javaBean = JavaBean("Peter")
    javaBean.hello()

    //  Escaping for Java identifiers that are keywords in Kotlin
    println(javaBean.`is`("Peter"))

    //  Null-Safety and Platform Types
    val list = ArrayList<String>()
    val item = list.get(0)
    //    item.substring(1)
    //    val nullable: String? = item
    //    val notNull: String = item
    //    nullable?.substring(1)
    //    notNull.substring(1)

}