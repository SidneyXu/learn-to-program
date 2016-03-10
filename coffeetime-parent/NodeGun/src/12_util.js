/**
 * Created by mrseasons on 16/3/9.
 */
var util = require('util');

// Inheritance
function Base() {
    this.name = 'base';
    this.sayHello = function () {
        console.log('Hello ' + this.name);
    };
}
Base.prototype.showName = function () {
    console.log(this.name);
};

function Sub() {
    this.name = 'sub';
    this.toString = function () {
        return this.name;
    }
}
util.inherits(Sub, Base);
var sub = new Sub();
//sub.sayHello()    not a function
sub.showName();

//  Inspect
console.log(util.inspect(sub));
console.log(util.inspect(sub, true));

//  Judgement
console.log(util.isArray([1, 2, 3]));
console.log(util.isDate(sub));
console.log(util.isError(sub));