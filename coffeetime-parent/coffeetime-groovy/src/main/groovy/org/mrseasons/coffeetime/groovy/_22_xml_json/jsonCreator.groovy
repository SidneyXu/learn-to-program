package org.mrseasons.coffeetime.groovy._22_xml_json

import groovy.json.JsonBuilder

/**
 * Created by mrseasons on 2/6/15.
 */
def json = new JsonBuilder()
json.call {
    results {
        result("x")
        result("y")
    }
}
println(json.toPrettyString())

def list = [
        [code: "111", value: "222"],
        [code: "333", value: "444"]
]
def builder = new JsonBuilder(list)
println builder.toPrettyString()

def root = new JsonBuilder()
root {
    data(
            list.collect {
                [
                        code : it.code,
                        value: it.value
                ]
            }
    )
}
println root.toPrettyString()