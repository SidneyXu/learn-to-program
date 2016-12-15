/**
 * Created by mrseasons on 16/3/8.
 */
var net = require('net');

net.connect({port: 1234}, function () {
    console.log('connect...');
}).on('data', function (b) {
    console.log("receive", b.toString());
    this.end();
})