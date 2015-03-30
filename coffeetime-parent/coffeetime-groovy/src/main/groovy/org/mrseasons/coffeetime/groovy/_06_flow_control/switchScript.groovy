package org.mrseasons.coffeetime.groovy._06_flow_control

/**
 * Created by mrseasons on 2015/2/9.
 */
def test(var) {
    switch (var) {
        case 0: println 0
            break
        case 11..20: println "11..20"
            break
        case [1, 2, 3]: println '[1,2,3]'
            break
        case Float: println 'Float'
            break
        case { it % 3 == 0 }: println 'Closure'
            break
        case ~'[0-9]{3}': println 'Regex'
            break
        default: println 'Default'
    }
}

test(0)     //0
test(20)    //11..20
test(11)    //11..20
test(30)    //Closure
test(2)     //[1,2,3]
test(1.2f)  //Float
test(100)   //Regex
test(1000)  //Default

