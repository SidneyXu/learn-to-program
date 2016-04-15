/**
 * Created by mrseasons on 16/3/24.
 */
'use strict';

const colors = ['red', 'green', 'blue'];
let iterator = colors[Symbol.iterator]();

for (let v of iterator) {
    console.log(v); // red green blue
}

for (let i in colors) {
    console.log(i); // 0 1 2
}

for (let v of colors) {
    console.log(v); // red green blue
}

Object.keys(colors).forEach(function (key) {
    console.log(key);
});