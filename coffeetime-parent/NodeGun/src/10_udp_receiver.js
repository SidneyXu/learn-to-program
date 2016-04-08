/**
 * Created by mrseasons on 16/4/7.
 */
var dgram = require('dgram');

var receiver = dgram.createSocket('udp4');

receiver.on('message', function (msg, rinfo) {
    console.log('receiver receive: %s from %s', msg, rinfo.address + ":" + rinfo.port);
    receiver.close();
});
receiver.on('listening', function () {
    var addr = receiver.address();
    console.log('receiver listen on %s', addr.address + ":" + addr.port);
});
receiver.bind(1234);