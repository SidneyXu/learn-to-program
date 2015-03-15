package org.mrseasons.coffeetime.groovy._30_builder_template

import groovy.text.SimpleTemplateEngine


/**
 * Created by mrseaons on 2015/1/3.
 */
class ToyTemplateOutXml {

    public static void main(String[] args) {
        def file = new File("coffeetime-groovy/src/test/resources/toy_xml.template");
        println file.getAbsolutePath()

        def binding = ["toyName": "toy1", "unitPrice": 100];
        def engine = new SimpleTemplateEngine()
        def template = engine.createTemplate(file).make(binding)
        println(template.toString())

        def outXml = new File('coffeetime-groovy/outputs/toy.xml')
        outXml.write(template.toString())
    }
}