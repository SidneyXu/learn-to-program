/**
 * Created by mrseasons on 16/3/2.
 */
var one = '1'
var two = '2'
console.log(typeof one, one + two)    //  string 12
console.log(typeof +one, +one + (+two))    //  number 3
console.log(Number(one) + Number(two))
console.log(parseInt(one, 10) + parseInt(two, 10))

console.log(2 - 1.8)    //  0.19999999999999996
console.log((2 - 1.8).toFixed(2))   //  0.20