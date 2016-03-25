/**
 * Created by mrseasons on 16/3/17.
 */
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var ObjectId = require('mongodb').ObjectID;

var url = 'mongodb://localhost:27017/test';

var insertDocument = function (db, callback) {
    db.collection('students').insertOne({
        "address": {
            "street": "2 Avenue",
            "zipcode": "10075"
        },
        "name": "Peter",
        "sex": "male",
        "date_of_birth": new Date("2014-10-01T00:00:00Z")
    }, function (err, result) {
        assert.equal(err, null);
        console.log("Inserted a document.");
        callback();
    });
};

var updateDocument = function (db, callback) {
    db.collection('students').updateOne(
        {"name": "Peter"},
        {
            $set: {"age": 20},
            $currentDate: {"lastModified": true}
        }, function (err, results) {
            console.log(results);
            callback();
        });
};

var removeDocument = function (db, callback) {
    db.collection('students').deleteMany(
        {"sex": "male"},
        function (err, results) {
            console.log(results);
            callback();
        }
    );
};

var findDocument = function (db, callback) {
    var cursor = db.collection('students').find();

    cursor.forEach(function (doc) {
        assert.ok(doc != null);
        console.dir(doc);
    }, function (err) {
        callback(err);
    });
};

MongoClient.connect(url, function (err, db) {
    assert.equal(null, err);
    console.log("Connected correctly to server.");

    //insertDocument(db, function () {
    //    updateDocument(db, function () {
    //        db.close();
    //    });
    //});

    findDocument(db, function () {
        db.close();
    });
});

