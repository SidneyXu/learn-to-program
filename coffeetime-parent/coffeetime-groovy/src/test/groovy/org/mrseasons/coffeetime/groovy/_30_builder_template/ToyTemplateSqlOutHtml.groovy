package org.mrseasons.coffeetime.groovy._30_builder_template

import groovy.sql.Sql
import groovy.text.SimpleTemplateEngine


/**
 * Created by mrseasons on 2015/1/3.
 */
class ToyTemplateSqlOutHtml {

    public static void main(String[] args) {
        def file = new File("coffeetime-groovy/src/test/resources/toy_html_sql.template");

        def db = "jdbc:mysql://localhost:3306/groovy?useUnicode=true&characterEncoding=UTF-8"
        def username = "root"
        def password = "root"
        def driver = "com.mysql.jdbc.Driver"

        Sql sql = Sql.newInstance(db, username, password, driver)

        def binding = ["title": "Display Toys", "sql": sql];
        def engine = new SimpleTemplateEngine()
        def template = engine.createTemplate(file).make(binding)
        println(template.toString())

        def outXml = new File('coffeetime-groovy/outputs/toy_sql.html')
        outXml.write(template.toString())
    }
}