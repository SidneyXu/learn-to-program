/**
 * Created by mrseasons on 16/3/12.
 */
var express = require('express');
var app = express();
var fs = require('fs');

//  Cookie
var cookieParser = require('cookie-parser');
app.use(cookieParser());

//  Post
var bodyParser = require('body-parser');
var urlencodedParser = bodyParser.urlencoded({extended: false});

//  Upload
var multer = require('multer');
app.use(multer({dest: '/tmp/'}).array('image'));


app.get('/', function (req, resp) {
    console.log("Cookies: ", req.cookies);
    resp.send('connected');
}).get('/index', function (req, resp) {
    resp.sendFile(__dirname + "/01_hello.js");
}).get('/users/:id', function (req, resp) {
    console.log(req.query);
    console.log(req.query.username);
    console.log(req.params.id);
    console.log(req.path);
    resp.json({'id': 1, 'name': 'Peter', 'age': 20});
}).get('/add_*', function (req, resp) {
    console.log(req.route);
    console.log(req.query);

    var ret = {
        name: req.query.name,
        age: req.query.age
    };
    console.log(ret);
    resp.end(JSON.stringify(ret));
}).post('/users', urlencodedParser, function (req, resp) {
    console.log(req.params);

    var ret = {
        name: req.body.name,
        age: req.body.age
    };
    console.log(ret);
    resp.end(JSON.stringify(ret));
}).post('/upload', function (req, resp) {
    console.log(req.files[0])
    var des_file = __dirname + "/" + req.files[0].originalname
    fs.readFile(req.files[0].path, function (err, data) {
        fs.writeFile(des_file, data, function (err) {
            var ret = '';
            if (err) {
                console.log(err);
            } else {
                ret = {
                    message: 'File uploaded successfully',
                    filename: req.files[0].originalname
                };
            }
            console.log(ret);
            resp.end(JSON.stringify(ret));
        })
    })
});

//  Static Resources
app.use(express.static('../inputs'));

var server = app.listen(5678, function () {
    var host = server.address().address;
    var port = server.address().port;
    console.log("server run on http://%s:%s", host, port);
});


