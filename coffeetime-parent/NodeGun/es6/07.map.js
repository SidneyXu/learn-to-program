/**
 * Created by mrseasons on 16/3/23.
 */
'use strict';

let map = new Map();
map.set('x', 1);
map.set('y', 10);
console.log(map.get('x'));
console.log(map.has('y'));
map.delete('x');

let m = new Map().set('x', 10).set('foo', 'bar');
console.log([...m]);

//  Loop
for (let entry of map.entries()) {
    console.log(entry[0], entry[1]);
}