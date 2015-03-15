package org.mrseasons.coffeetime.groovy._30_builder_template

import groovy.text.SimpleTemplateEngine
import org.mrseasons.coffeetime.groovy.support.Toy


/**
 * Created by mrseaons on 2015/1/3.
 */
class ToyTemplateOutHtml {

    public static void main(String[] args) {
        def file = new File("coffeetime-groovy/src/test/resources/toy_html.template");

        def toys = []
        def toy1 = new Toy(toyName: 'toy1', unitPrice: 100)
        def toy2 = new Toy(toyName: 'toy2', unitPrice: 200)
        def toy3 = new Toy(toyName: 'toy3', unitPrice: 300)
        toys << toy1 << toy2 << toy3

        def binding = ["title": "Display Toys", "toys": toys];
        def engine = new SimpleTemplateEngine()
        def template = engine.createTemplate(file).make(binding)
        println(template.toString())

        def outXml = new File('coffeetime-groovy/outputs/toy.html')
        outXml.write(template.toString())
    }
}