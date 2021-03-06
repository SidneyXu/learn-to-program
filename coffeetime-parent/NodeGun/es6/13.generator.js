/**
 * Created by mrseasons on 16/4/1.
 */
'use strict';

function* helloWorldGenerator() {
    yield 'hello';
    yield 'world';
    return 'ending';
}

var hw = helloWorldGenerator();
console.log(hw.next()); //  { value: 'hello', done: false }
console.log(hw.next()); //  { value: 'world', done: false }
console.log(hw.next()); //  { value: 'ending', done: true }
console.log(hw.next()); //  { value: undefined, done: true }
 

function showLoadingScreen() {
    console.log('loading...');
}
function hideLoadingScreen() {
    console.log('dismiss loading...');
}
function loadUIDataAsynchronously() {
    console.log('load data');
}
function* loadUI() {
    showLoadingScreen();
    yield loadUIDataAsynchronously();
    hideLoadingScreen();
}
var loader = loadUI();
loader.next();
loader.next();