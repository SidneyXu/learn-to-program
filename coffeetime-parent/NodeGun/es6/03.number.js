/**
 * Created by mrseasons on 16/3/15.
 */
//  Infinity
console.log(Number.isFinite(NaN));  //  false
console.log(Number.isFinite(Infinity)); //  false

//  NaN
console.log(Number.isNaN(NaN)); //  true
console.log(Number.isNaN(15));   //  false

//  Parse
Number.parseInt('12.34');    // 12
Number.parseFloat('123.45#');    // 123.45

//  Judgement
Number.isInteger(25);    // true
Number.isInteger(25.0);  // true
Number.isInteger(25.1);  // false

//  Math
Math.trunc(-4.1);    // -4
Math.sign(-5);   // -1
Math.sign(5);    // +1
Math.sign(0);    // +0
