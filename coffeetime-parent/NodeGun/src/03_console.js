/**
 * node 03_console.js 1 2 3
 * Created by mrseasons on 16/3/2.
 */
console.log('hello')
console.error('404')

// Console Arguments
var argv = process.argv;
console.log(argv)

var args = argv.slice(2)
console.log(args)