/**
 * Created by mrseasons on 16/3/30.
 */
'use strict';

var [a, b, c] = [1, 2, 3];
let [head, ...tail] = [1, 2, 3, 4];
var { bar, foo } = {foo: "aaa", bar: "bbb"};
var jsonData = {
    id: 42,
    status: "OK",
    data: [867, 5309]
};

let { id, status, data: number } = jsonData;