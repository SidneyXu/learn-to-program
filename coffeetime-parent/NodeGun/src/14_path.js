/**
 * Created by mrseasons on 16/3/9.
 */
var path = require('path');

console.log('normalization', path.normalize('/one//two/three/..'));
console.log('absolute', path.resolve('filter.js'));
console.log('ext', path.extname('foobar.js'));
console.log('dir', path.dirname(path.resolve('foobar.js')));