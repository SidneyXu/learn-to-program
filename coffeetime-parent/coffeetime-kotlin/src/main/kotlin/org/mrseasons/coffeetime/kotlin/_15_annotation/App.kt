package org.mrseasons.coffeetime.kotlin._15_annotation

/**
 * Created by mrseasons on 2015/06/26.
 */
fun main(args: Array<String>) {
    // Annotate the lambdas
    var f = @fancy { println("lambda") }
}

//  Declare an annotation
@Target(AnnotationTarget.EXPRESSION, AnnotationTarget.CLASS, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION,
        AnnotationTarget.CONSTRUCTOR, AnnotationTarget.PROPERTY_SETTER)
annotation class fancy

//  Usage
//  In most cases, the @ sign is optional.
// It is only required when annotating expressions or local declarations
@fancy class Foo {
    @fancy fun baz(@fancy foo: Int): Int {
        return (@fancy 1)
    }
}

@fancy class Foo2 {
    @fancy fun baz(@fancy foo: Int): Int {
        @fancy fun bar() {
        }
        return (@fancy 1)
    }
}

//  Annotate the primary constructor
//  must add the keyword constructor
class Foo3 @fancy constructor() {
    //  annotate property accessors
    var x: Int = 1
        @fancy set
}

//  Annotation with parameters
annotation class special(val why: String)

@special("example") class Foo4


