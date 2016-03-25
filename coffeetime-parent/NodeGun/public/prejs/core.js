/**
 * Created by mrseasons on 16/3/3.
 */
window.addEventListener('load', function (e) {
    var addOne = require('./foo.js');
    var result = addOne(10);
    document.getElementById('text').innerHTML = result;
}, false);
