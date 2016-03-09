/**
 * Created by mrseasons on 16/3/8.
 */
var net = require('net');

// nc localhost 1234
var server = net.createServer(function (socket) {
    socket.on('end', function () {
        console.log('客户端关闭连接');
        server.close();
    });
    socket.end('ping\n');
}).listen(1234);