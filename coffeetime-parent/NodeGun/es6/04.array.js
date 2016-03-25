/**
 * Created by mrseasons on 16/3/21.
 */
'use strict';

//  Array Like
//  Array.from()
let arrayLike = {
    '0': 'a',
    '1': 'b',
    '2': 'c',
    length: 3
};
let array = Array.from(arrayLike);
console.log(array.pop());   //  c
console.log(array.length);  //  2

let set = new Set(['a', 'b']);
console.log(Array.from(set));    // ['a', 'b']

let nums = [1, 2, 3];
console.log(Array.from(nums, n => n * 3));  //  [ 3, 6, 9 ]
console.log(Array.from(nums).map(n => n * 3));  //  [ 3, 6, 9 ]


//  Array.of()
console.log(Array.of(1, 2, 3).length);  //  3

//  Loop
for (let i of array.keys()) {
    console.log(i); //  0   1
}
for (let v of array) {
    console.log(v); //  a   b
}
for (let e of array.entries()) {
    console.log(e[0], e[1]);
}

//  Methods
console.log([1, 2, 3, 4, 5, 6].filter(n => n % 2 == 0));    //  2   4   6
console.log([1, 2, 3, 4, 5, 6].find(n => n % 2 == 0));    //  2

[10, 'a'].forEach((x, i) => console.log(x, i)); // 1
[10, 'a'].every(x => x === 'a');  //  false
[10, 'a'].some(x => x === 'a');   //  true
[, 'a', undefined, null].join('#'); // "#a##"
[, 'a', undefined, null].toString(); // ",a,,"