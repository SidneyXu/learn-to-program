/**
 * Created by mrseasons on 16/3/19.
 */
'use strict';

//  Loop
for (let c of 'foo') {
    console.log(c);
}

//  Method
var s = 'Hello world!';

console.log(s.startsWith('Hello')); //  true
console.log(s.endsWith('!'));   //  true
console.log(s.includes('o'));   //  true

console.log('x'.repeat(3)); //  xxx

//  Multiline
console.log(`string text line 1
string text line 2`);

//  Template
var name = "Bob", time = "today";
console.log(`Hello ${name}, how are you ${time}?`);