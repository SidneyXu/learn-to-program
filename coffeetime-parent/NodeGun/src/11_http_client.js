/**
 * Created by mrseasons on 16/3/8.
 */
var http = require('http');

var options = {
    host: 'localhost',
    port: 1234,
    path: '/foo/bar?x=1&y=2'
};
http.get(options, function (resp) {
    resp.on('error', console.error);
    resp.on('data', function (data) {
        console.log('get data \n(%s)', data.toString())
    });
});

http.request({
    port: 1234,
    method: 'PUT',
    headers: {
        "Content-Type": 'application/json'
    }
}, function (resp) {
    resp.on('error', console.error);
    resp.on('data', function (data) {
        console.log('put data \n(%s)', data.toString())
    });
}).end(JSON.stringify({'你好': '再见'}), 'UTF-8');

var req = http.request({
    port: 1234,
    method: 'POST'
}, function (resp) {
    resp.on('error', console.error);
    resp.on('data', function (data) {
        console.log('post data \n(%s)', data.toString())
    });
})
req.write('ping');
req.end();