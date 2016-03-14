/**
 * Created by mrseasons on 16/3/10.
 */
var fs = require('fs');
var Promise = require('promise');
function readJSONPromise(file, callback) {
    return new Promise(function (fulfill, reject) {
        fs.readFile(file, function (err, res) {
            if (err)
                reject(err);
            else
                fulfill(res);
        });
    }).then(function (res) {
        return JSON.parse(res);
    }, function (err) {
        console.log("if error last promise onRejected() is called");
        return err;
    }).nodeify(callback);
}

readJSONPromise('../inputs/students.json', function (err, res) {
    console.log(err, res);
});