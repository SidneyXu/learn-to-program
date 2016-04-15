/**
 * Created by mrseasons on 16/3/29.
 */
'use strict';

var fs = require('fs');

var file = '../inputs/students.json';

var promise = new Promise(function (resolve, reject) {
    fs.readFile(file, function (err, res) {
        if (err)
            reject(err);
        else
            resolve(res);
    });
});

promise.then(function (res) {
    return JSON.parse(res);
}, function (err) {
    console.error(err)
    return err;
}).then(function (res) {
    console.log(res);
});