/**
 * Created by mrseasons on 16/3/26.
 */
'use strict';

var f1 = function (v) {
    return v;
};
var f2 = v => v;
console.log(f1('foo'));
console.log(f2('bar'));


