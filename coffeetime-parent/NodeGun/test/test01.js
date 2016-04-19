/**
 * Created by mrseasons on 16/4/18.
 */
var should = require('should');
var fs = require('fs');

describe('test index of', function () {
    it('should return -1 when not present', function () {
        [1, 2, 3].indexOf(4).should.equal(-1);
    });
});

describe('test async operation', function () {
    it('read file should ok', function () {
        fs.readFile('../src/utils.js', function (err, data) {
            should.not.exists(err);
            done();
        });
    });
});