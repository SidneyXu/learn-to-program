/**
 * Created by mrseasons on 16/3/9.
 */
process.on('exit', function (code) {
    console.log('exit code is', code);
});

console.log(process.platform);

setTimeout(function () {
    console.log('timeout');
}, 0);

setImmediate(function () {
    console.log('immediate');
});

process.nextTick(function () {
    console.log('tick');
});

console.log('execute');