/**
 * Created by mrseasons on 16/3/5.
 */
var events = require('events');

var emitter = new events.EventEmitter();

//  register event
emitter.on('message', function (err, data) {
    if (err) {
        console.error(err);
        return;
    }
    if (data) {
        console.log('receive new message "%s"', data);
    } else {
        console.log('receive empty message')
    }
})

//  fire event
emitter.emit('message');
emitter.emit('message', '404');
emitter.emit('message', null, 'ping');

//  one-time event
emitter.once('close', function () {
    console.log('close');
})
emitter.emit('close');
emitter.emit('close');

//  remove
emitter.removeListener('connect', function () {
    console.log('remove');
})