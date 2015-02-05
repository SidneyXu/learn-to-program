package org.mrseasons.coffeetime.groovy._02_type

/**
 * Created by mrseasons on 2/3/15.
 */
//数据类型
def x = 2
def y = 0.1
println x - y       //1.9

//字符串
def singleQuote = 'abc'
def doubleQuotes = "abc"
def singleQuote2 = 'abc${x}'
def doubleQuotes2 = "abc${x}"
println singleQuote.class   //class java.lang.String
println doubleQuotes.class  //class java.lang.String
println singleQuote2.class  //class java.lang.String
println doubleQuotes2.class //class org.codehaus.groovy.runtime.GStringImpl

println singleQuote2        //abc${x}
println doubleQuotes2       //abc2

def multi1='''abc
def
    fhi${x}
'''
def multi2="""abc
def
    fhi${x}
"""
println multi1.class
println multi2.class
println multi1
println multi2

//类型推断
String st1 = "Hello World";
def str2 = "Hello World"

//静态类型
Date staticDate = new Date()

//动态类型
def dynamicDate = new Date()

println staticDate.class  //class java.util.Date
println dynamicDate.class  //class java.util.Date

//staticDate = 1        Cannot cast object '1' with class 'java.lang.Integer' to class 'java.util.Date'
dynamicDate = 2
println dynamicDate

//一切皆对象
int i = 1
def j = 2
println i.class    //class java.lang.Integer
println j.class    //class java.lang.Integer

