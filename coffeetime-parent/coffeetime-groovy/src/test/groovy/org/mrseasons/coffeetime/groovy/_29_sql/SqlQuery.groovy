package org.mrseasons.coffeetime.groovy._29_sql

/**
 * Created by mrseasons on 2015/1/1.
 */
abstract class SqlQuery {
    def sql
    def query

    def abstract mapRow(row)    //delay the implement

    def execute() {
        def rowsList = sql.rows(query)
        def results = []
        def size = rowsList.size()
        0.upto(size - 1) { i ->
            results << this.mapRow(rowsList[i])
        }
        return results
    }
}