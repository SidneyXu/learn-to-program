package org.mrseasons.coffeetime.groovy.xml

/**
 * Created by mrseasons on 2015/1/31.
 */
//MarkupBuilder
def sw= new StringWriter()
def xml = new groovy.xml.MarkupBuilder(sw)
xml.langs(type:"current"){
    language("Java")
    language("Groovy")
    language("JavaScript")
}
println(sw)

//jsonBuilder
sw=new StringBuilder()
def json=new groovy.json.JsonBuilder()
json.call{
    results{
        result("x")
        result("y")
    }
}
println(json.toPrettyString())

def list = [
        [code: "111", value: "222"],
        [code: "333", value: "444"]
]
def builder = new groovy.json.JsonBuilder(list)
println builder.toString()

def root=new groovy.json.JsonBuilder()
root{
    data(
            list.collect{
                [
                        code:it.code,
                        value: it.value
                ]
            }
    )
}
println root.toString()


//StreamingMarkupBuilder
//more powerful builder, can be used to create CDATA
//until bind() is called, the xml is created, that can implement async create serveral parts in different threads
def comment = "<![CDATA[<!-- address is new to this release -->]]>"
builder = new groovy.xml.StreamingMarkupBuilder()
builder.encoding = "UTF-8"
def person = {
    mkp.xmlDeclaration()
    mkp.pi("xml-stylesheet": "type='text/xsl' href='myfile.xslt'" )
    mkp.declareNamespace('':'http://myDefaultNamespace')
    mkp.declareNamespace('location':'http://someOtherNamespace')
    person(id:100){
        firstname("Jane")
        lastname("Doe")
        mkp.yieldUnescaped(comment)
        location.address("123 Main")
    }
}
def writer = new FileWriter("person.xml")
writer << builder.bind(person)