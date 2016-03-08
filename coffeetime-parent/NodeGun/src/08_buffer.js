/**
 * Created by mrseasons on 16/3/7.
 */

//  Create Instance with Length
var buffer = new Buffer(10)
console.log(buffer)

//  Create Instance with Array
buffer = new Buffer([10, 20, 30])
console.log(buffer)

//  Create Instance with utf-8 string
buffer = new Buffer('早上好', 'utf-8')
console.log(buffer)
console.log(buffer.toString())

//  Write
buffer = new Buffer(256)
var len = buffer.write('hello world')
console.log(len)
console.log(buffer.toString())

//  Merge
Buffer.concat([buffer, buffer])