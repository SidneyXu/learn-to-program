/**
 * Created by mrseasons on 16/3/9.
 */
process.on('exit', function (code) {
    console.log('exit code is', code);
});

console.log(process.platform);