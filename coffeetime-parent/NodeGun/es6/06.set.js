/**
 * Created by mrseasons on 16/3/22.
 */
'use strict';
var set = new Set();

[2, 3, 5, 4, 5, 2, 2].map(n => set.add(n));

set = new Set([1, 2, 3, 4, 4]);
console.log([...set]);  //  [ 1, 2, 3, 4 ]

set.add(10);
set.delete(3);
console.log(set.has(1));    //  true

//  Loop
for (let i of set) {
    console.log(i); //  1 2 4 10
}
