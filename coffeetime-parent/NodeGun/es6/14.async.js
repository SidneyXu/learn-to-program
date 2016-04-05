/**
 * Created by mrseasons on 16/4/1.
 */
'use strict';

function loadUIDataAsynchronously() {
    return 'load data';
}

var loadUI = async function () {
    var showLoadingScreen = await 'loading';
    console.log(showLoadingScreen.toString());
    var p = await loadUIDataAsynchronously();
    var hideLoadingScreen = await 'dismiss loading..';
    console.log(hideLoadingScreen.toString());
    return p;
};

loadUI().then(function (result) {
    console.log(result);
});
