/**
 * Created by mrseasons on 16/3/9.
 */
var dns = require('dns');

dns.lookup('www.github.com', function (err, addr, family) {
    console.log('addr', addr);
    dns.reverse(addr, function (err, hostnames) {
        if (err) {
            console.log(err.stack);
            return;
        }
        console.log(JSON.stringify(hostnames));
    })
})