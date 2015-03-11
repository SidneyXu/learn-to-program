package org.mrseasons.coffeetime.groovy._22_xml_json

import groovy.text.SimpleTemplateEngine


/**
 * Created by mrseaons on 2015/1/3.
 */
class ToyTemplateOutXml {

    public static void main(String[] args) {
        def file=new File("sample_groovy\\src\\main\\groovy\\com\\mrseasons\\example\\groovy\\web\\toy_xml.template");
        println file.getAbsolutePath()

        def binding=["toyName":"toy1","unitPrice":100];
        def engine=new SimpleTemplateEngine()
        def template=engine.createTemplate(file).make(binding)
        println(template.toString())

        def outXml=new File('sample_groovy\\src\\main\\groovy\\com\\mrseasons\\example\\groovy\\outputs\\toy.xml')
        outXml.write(template.toString())
    }
}