/**
 * Created by mrseasons on 16/3/7.
 */
var fs = require('fs')

var input = '../inputs/students.csv'
var clone = '../outputs/students.csv'
var output = '../outputs/hello.tx'
var gz = '../outputs/foo.gz'

//  Read Stream
var data = ''
var readStream = fs.createReadStream(input)
readStream.setEncoding('utf-8')
readStream.on('data', function (chunk) {
    data += chunk
}).on('end', function () {
    console.log(data)
}).on('error', function (err) {
    console.log(err.stack)
})

//  Write Stream
var writeStream = fs.createWriteStream(output)
writeStream.write('hello world', 'utf-8')
writeStream.end()
writeStream.on('finish', function () {
    console.log("finish writing");
}).on('error', function (err) {
    console.log(err.stack);
})

//  Pipe Stream
readStream = fs.createReadStream(input)
writeStream = fs.createWriteStream(clone)
readStream.pipe(writeStream)

//  Chain Stream
var zlib = require('zlib')
fs.createReadStream(input)
    .pipe(zlib.createGzip())
    .pipe(fs.createWriteStream(gz))
