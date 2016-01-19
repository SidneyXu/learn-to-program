require 'rubygems'
require 'json'

json = <<ST
{
    "data": [
        {
            "code": "404",
            "value": "not found"
        },
        {
            "code": "302",
            "value": "redirect"
        }
    ]
}
ST
obj = JSON.parse(json)
puts obj['data'][0]['code']