package org.mrseasons.coffeetime.groovy._02_03_type_scope_script

/**
 * Created by mrseasons on 2/3/15.
 */
//Data type
//Number
def x = 2
def y = 0.1
println x - y       //1.9

//Methods
def store = ""
10.times { store += "x" }
assert store == "xxxxxxxxxx"

store = ""
1.upto(5) { n -> store += n }
assert store == "12345"

store = ""
2.downto(-2) { n -> store += n + "" }
assert store == "210-1-2"

store = ""
0.step(0.5, 0.1) { n -> store += n + "," }
assert store == "0,0.1,0.2,0.3,0.4,"

//String
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

def multi1 = '''abc
def
    fhi${x}
'''
def multi2 = """abc
def
    fhi${x}
"""
println multi1.class
println multi2.class
println multi1
println multi2

def str = 'Groovy&Grails&lxt008'
println str[4]                  //v
println str[-1]                 //8
println str[1..2]               //ro
println str[1..<3]              //ro
println str[4, 1, 6]            //vr&
println 'a' == 'a'              //true
println 'a' <=> 'a'             //0
println 'a'.compareTo('a')      //0
println 'a' - 'a'               //
println 'a' + 'a'               //aa
println 'a' * 3                 //aaa

str = 'Groovy'
println str.center(11)          //  Groovy
println str.center(2)           //Groovy
println str.center(11, '=')     //==Groovy===
println str.count('o')          //2
println str.leftShift(' world') //Groovy world
println str << ' world'         //Groovy world
println str.minus('vy')         //Groo
println str - 'vy'              //Groo

println str.next()              //Groovz
println str.previous()          //Groovx

println str.padLeft(4)          //Groovy
println str.padLeft(11)         //     Groovy
println str.padLeft(11, "=")    //=====Groovy

println str.replaceAll('[a-z]') { ch -> ch.toUpperCase() }  //GROOVY
println '123'.toDouble()                                    //123.0
println '123'.toList()                                      //[1, 2, 3]

str = "Groovy Grails&lxt"
println str.tokenize()                                      //[Groovy, Grails&lxt]
println str.tokenize('&')                                   //[Groovy Grails, lxt]
println str.tokenize().getClass().getName()                 //java.util.ArrayList

//Type Inference
String st1 = "Hello World";
def str2 = "Hello World"

//Static Type
Date staticDate = new Date()

//Dynamic Type
def dynamicDate = new Date()

println staticDate.class  //class java.util.Date
println dynamicDate.class  //class java.util.Date

//staticDate = 1        Cannot cast object '1' with class 'java.lang.Integer' to class 'java.util.Date'
dynamicDate = 2
println dynamicDate

//everything is object
int i = 1
def j = 2
println i.class    //class java.lang.Integer
println j.class    //class java.lang.Integer

