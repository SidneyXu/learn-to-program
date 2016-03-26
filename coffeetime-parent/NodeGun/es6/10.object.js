/**
 * Created by mrseasons on 16/3/26.
 */
//  Property
var foo = 'bar';
var bar = {foo};
console.log(bar);   //  { foo: 'bar' }
console.log({foo: foo});    //  { foo: 'bar' }

function f(x, y) {
    return {x, y};
}
console.log(f(1, 2));   //  { x: 1, y: 2 }

//  Method
var obj = {
    hello(){
        console.log('Hello!');
    }
};
var obj2 = {
    hello: function () {
        console.log('Hello!');
    }
};
obj.hello();
obj2.hello();

//  Assign
var target = {};
var source1 = {x: 1};
var source2 = {y: 10};
Object.assign(target, source1, source2);
console.log(target);

source1.z = 2;
source1.x = 100;
console.log(source1);
console.log(target);

function clone(source) {
    return Object.assign({}, source);
}
target = clone(source1);
console.log(target);