/**
 * Created by mrseasons on 16/3/10.
 */
var fs = require('fs');
var Q = require('q');
function readJSONQ(file, callback) {
    var deferred = Q.defer();
    fs.readFile(file, function (err, res) {
        if (err) {
            deferred.reject(err);
        } else {
            deferred.resolve(res);
        }
    });
    return deferred.promise
        .then(function (res) {
            return JSON.parse(res);
        }, function (err) {
            console.log("if error last promise onRejected() is called");
            return err;
        }).nodeify(callback);
}
readJSONQ('../inputs/students.json', function (err, res) {
    console.log(err, res);
});