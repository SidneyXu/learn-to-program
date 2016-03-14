/**
 * Created by mrseasons on 16/3/10.
 */
var fs = require('fs');

function readJSON(file, callback) {
    fs.readFile(file, function (err, res) {
        if (err) {
            callback(err);
            return;
        }
        try {
            res = JSON.parse(res);
        } catch (e) {
            return callback(e);
        }
        callback(null, res);
    });
}
readJSON('../inputs/students.json', function (err, res) {
    console.log(err, res);
});