package org.mrseasons.coffeetime.scala._24_java;

/**
 * Created by mrseasons on 4/13/15.
 */
public class JavaCallScala {

    public static void main(String[] args) {
        ScalaBean scalaBean = new ScalaBean("bean");
        System.out.println(scalaBean.name());   //bean
        System.out.println(scalaBean.getName());    //bean

        ScalaExample.info(); //scala
        ScalaExample example = ScalaExample.get("abc");
        System.out.println(example.name()); //abc
    }
}
