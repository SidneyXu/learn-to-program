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

def name = request.getParameter("toyName")
def unitPrice = request.getParameter("unitPrice")
def toy = new Toy(toyName: name, unitPrice: unitPrice)
sql.execute("insert into toys values(${toy.toyName},${toy.unitPrice})")

print """
<html>
    <head>Success add</head>
    <body>
        toyName is ${name}
        unitprice is ${unitprice}
        <a href='/toy/index.gsp'>top</a>
    </body>
</html>
"""