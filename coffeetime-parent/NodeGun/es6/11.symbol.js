/**
 * Created by mrseasons on 16/3/28.
 */
'use strict';

var s1 = Symbol();
var s2 = Symbol();
console.log(s1 === s2);   //  false

var s3 = Symbol('s3');
var s4 = Symbol('s4');
var s5 = Symbol.for('s4');
var s6 = Symbol.for('s4');
console.log(s3 === s4);  //  false
console.log(s5 === s4);  //  false
console.log(s5 === s6);  //  true

//  As Property
var foo = Symbol("foo");

//  One
var obj1 = {};
obj1[foo] = 'one';
obj1['bar'] = 'foobar';

//  Two
var obj2 = {
    [foo]: 'two'
};

//  Three
var obj3 = {};
Object.defineProperty(obj3, foo, {value: 'three'});

console.log(obj1[foo]);
console.log(obj2[foo]);
console.log(obj3[foo]);


for (let v in obj1) {
    console.log(v); //  bar
}

console.log(Object.getOwnPropertySymbols(obj1));    //  [ Symbol(foo) ]