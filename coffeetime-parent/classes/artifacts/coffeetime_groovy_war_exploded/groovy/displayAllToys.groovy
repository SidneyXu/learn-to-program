package groovy

import groovy.sql.Sql

/**
 * Created by mrseaons on 2015/1/3.
 */
def db = "jdbc:mysql://localhost:3306/groovy?useUnicode=true&characterEncoding=UTF-8"
def username = "root"
def password = "root"
def driver = "com.mysql.jdbc.Driver"

Sql sql = Sql.newInstance(db, username, password, driver)

print "<html><head>find</head><body>"
sql.eachRow("select * from toys", []) { t ->
    println(t.toyName + ":" + t.unitPrice)
}
print "</body></html>"
