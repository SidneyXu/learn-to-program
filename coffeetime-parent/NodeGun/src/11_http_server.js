/**
 * Created by mrseasons on 16/3/8.
 */
var http = require('http');
var fs = require('fs');
var map = require('through2-map');
var url = require('url');
var querystring = require('querystring');

http.createServer(function (req, resp) {
    resp.setEncoding('utf-8')

    if (req.method == 'POST') {
        var d = '';
        req.on('data', function (chunk) {
            d += chunk;
        });
        req.on('end', function () {
            resp.writeHead(200, {'Content-Type': 'application/json'});
            resp.end(JSON.stringify({
                "x": 1,
                "y": 2
            }));
        });
        return;
    } else if (req.method == 'PUT') {
        req.pipe(map(function (chunk) {
            return chunk.toString().toUpperCase();
        })).pipe(resp);
        return;
    }

    //  Parse Url
    var parsedUrl = url.parse(req.url, true);
    console.log('parsedUrl', parsedUrl);

    resp.writeHead(200, {'Content-Type': 'text/plain'});
    fs.createReadStream('../inputs/students.csv')
        .pipe(resp);
}).listen(1234);