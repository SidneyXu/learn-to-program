/**
 * Created by mrseasons on 16/3/2.
 */
var fs = require('fs');
var path = require('path');


var res = '../inputs/students.csv';

// Sync Read
var buffer = fs.readFileSync(res);
console.log(typeof buffer, buffer);
var text = buffer.toString();
console.log('sync read buffer: %s', text.replace(/\n/g, ';'));

// auto convert buffer
text = fs.readFileSync(res, 'utf-8');
console.log('sync read string: %s', text.replace(/\n/g, ';'));

//  Async Read
fs.readFile(res, function (err, buf) {
    console.log('default async read file: %s', buf.toString().replace(/\n/g, ';'));
})

// Open File
fs.open(res, 'r+', function (err, fd) {
    var buf = new Buffer(1024);
    fs.read(fd, buf, 0, buf.length, 0, function (err, len) {
        console.log('read from fd: %s', buf.slice(0, len).toString().replace(/\n/g, ';'));
        fs.close(fd, function (err) {
            ;
            console.log('done')
        })
    })
})

//  Read Dir
fs.readdir('../inputs', function (err, files) {
    files.forEach(function (f) {
        if (path.extname(f) == '.json') {
            console.log('read dir type(%s) %s', typeof f, f);
        }
    })
})

// Get Status
fs.stat(res, function (err, stats) {
    console.log('is file? %s', stats.isFile());  //  true
})

// Write File
fs.writeFile('../foo.txt', 'hello world', function (err) {
    console.log('finish writing');

    // Delete File
    fs.unlink('../foo.txt', function (err) {
        console.log('delete done');
    })
})