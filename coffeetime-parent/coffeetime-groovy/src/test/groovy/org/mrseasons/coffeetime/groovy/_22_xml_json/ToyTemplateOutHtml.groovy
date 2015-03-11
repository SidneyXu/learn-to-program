package org.mrseasons.coffeetime.groovy._22_xml_json

import com.mrseasons.example.groovy.Toy
import groovy.text.SimpleTemplateEngine


/**
 * Created by mrseaons on 2015/1/3.
 */
class ToyTemplateOutHtml {

    public static void main(String[] args) {
        def file=new File("sample_groovy\\src\\main\\groovy\\com\\mrseasons\\example\\groovy\\web\\toy_html.template");

        def toys=[]
        def toy1=new Toy(toyName: 'toy1',unitPrice: 100)
        def toy2=new Toy(toyName: 'toy2',unitPrice: 200)
        def toy3=new Toy(toyName: 'toy3',unitPrice: 300)
        toys<<toy1<<toy2<<toy3

        def binding=["title":"Display Toys","toys":toys];
        def engine=new SimpleTemplateEngine()
        def template=engine.createTemplate(file).make(binding)
        println(template.toString())

        def outXml=new File('sample_groovy\\src\\main\\groovy\\com\\mrseasons\\example\\groovy\\outputs\\toy.html')
        outXml.write(template.toString())
    }
}