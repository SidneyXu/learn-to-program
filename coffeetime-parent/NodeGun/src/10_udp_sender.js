/**
 * Created by mrseasons on 16/4/7.
 */
var dgram = require('dgram');

var message = new Buffer('Hello World');
var sender = dgram.createSocket('udp4');
sender.send(message, 0, message.length, 1234, 'localhost', function (err, bytes) {
    sender.close();
});