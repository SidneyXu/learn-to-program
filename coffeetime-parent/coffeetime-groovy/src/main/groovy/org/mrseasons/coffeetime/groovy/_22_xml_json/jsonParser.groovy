package org.mrseasons.coffeetime.groovy._22_xml_json

import groovy.json.JsonSlurper

/**
 * Created by mrseasons on 2/6/15.
 */
def json = """
{
    "data": [
        {
            "code": "111",
            "value": "222"
        },
        {
            "code": "333",
            "value": "444"
        }
    ]
}
"""
def data = new JsonSlurper().parseText(json)
println data.data[0].code           //111