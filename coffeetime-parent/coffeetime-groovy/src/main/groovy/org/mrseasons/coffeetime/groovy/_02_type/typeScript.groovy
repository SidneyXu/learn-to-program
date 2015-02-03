package org.mrseasons.coffeetime.groovy._02_type

/**
 * Created by mrseasons on 2/3/15.
 */
//数据类型
def x = 2
def y = 0.1
println x - y       //1.9

//类型推断

//静态类型
String str1 = "Hello World";

//动态类型
def str2 = "Hello World"
println str1.class  //class java.lang.String
println str2.class  //class java.lang.String

str1 = 1
str2 = 2
println str2

String str3 = new String("Good bye");
str3 = 3
println str3

//一切皆对象
int i = 1
def j = 2
println i.class    //class java.lang.Integer
println j.class    //class java.lang.Integer

