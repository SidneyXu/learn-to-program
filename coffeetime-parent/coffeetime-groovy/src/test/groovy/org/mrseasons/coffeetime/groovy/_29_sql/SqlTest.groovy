package org.mrseasons.coffeetime.groovy._29_sql

import groovy.sql.Sql

/**
 * Created by mrseasons on 3/10/15.
 */
class SqlTest extends GroovyTestCase {

    def db = "jdbc:mysql://localhost:3306/groovy?useUnicode=true&characterEncoding=UTF-8"
    def username = "root"
    def password = "root"
    def driver = "com.mysql.jdbc.Driver"

    Sql sql = Sql.newInstance(db, username, null, driver)

    @Override
    protected void setUp() throws Exception {
        super.setUp()
        sql.execute("create table if not exists toys(toyName varchar(40), unitPrice int(8))")
    }


    void testSql() {
        assertNotNull(sql)
    }

    void testCrud() {
        //insert
        def toy = new Toy(toyName: "toy1", unitPrice: 100)
        sql.execute("insert into toys values(${toy.toyName}, ${toy.unitPrice})")

        //update
        sql.execute("update toys set unitPrice=? where toyName=?", [200, toy.toyName])

        //query
        sql.eachRow("select * from toys where unitPrice>?", [100]) { t ->
            println t.toyName + ":" + t.unitPrice
        }

        //delete
        sql.execute("delete from toys")
    }

    static class Toy {
        def toyName
        def unitPrice

        String toString() {
            return toyName + ":" + unitPrice;
        }
    }

    void testSqlQuery() {
        def q = new SqlQuery() {
            @Override
            def mapRow(Object row) {
                return new Toy(toyName: row["toyName"], unitPrice: row["unitPrice"])
            }
        }
        def toy = new Toy(toyName: "toy1", unitPrice: 100)
        sql.execute("insert into toys values(${toy.toyName}, ${toy.unitPrice})")

        q.sql = sql
        q.query = "select * from toys"
        Toy[] toys = q.execute();
        toys.each { t ->
            println(t.toyName + ":" + t.unitPrice)
        }
    }

}
