package org.mrseasons.coffeetime.kotlin._11_class

import java.util.Date

/**
 * Created by mrseasons on 2015/06/05.
 */
public class Person {
    //  default getter and setter
    var address = ""
    public var age: Int = 0

    //  specify getter and setter
    var trueAge: Int
        get() = age
        set(pAge) {
            if (pAge > age) {
                age = pAge
            }
        }

    //  backing field should start with "$"
    //  must be initialized first
    //  if not using "$", backAge will call the getter and stack overflow may occurs
    var backAge: Int = 0
        get() = $backAge
        set(pAge) {
            if (pAge > $backAge) {
                $backAge = pAge
            }
        }

    // change the visiblity
    var setterVisiblity: String = "abc"
        private set

    //  only getter
    val birthday = Date()
}

//  class with no body
class Empty

