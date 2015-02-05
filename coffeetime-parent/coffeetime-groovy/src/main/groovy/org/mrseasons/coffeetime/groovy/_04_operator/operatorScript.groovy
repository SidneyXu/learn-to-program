package org.mrseasons.coffeetime.groovy._04_operator

/**
 * Created by mrseasons on 2/5/15.
 */
//相等
Integer x = new Integer(2)
Integer y = new Integer(2)
Integer z

println x == y      //true
println x.is(y)     //false
println z == null   //true
println z.is(null)  //true

//安全引用操作符
//old
List<Person_> people = [null, new Person_(name: "Jack")]
for (Person_ person : people) {
    if (person != null) {
        println person.name
    }
}
//output
//Jack
println()

//new
for (Person_ person : people) {
    println person?.name
}
//output
//null
//Jack

//猫王操作符
//old
String agentStatus = "Active"
String status = agentStatus != null ? agentStatus : "Inactive"
assert status == "Active"

//new
//自动转为boolean值
status = agentStatus ? agentStatus : "Inactive"
assert status == "Active"

status = agentStatus ?: "Inactive"
assert status == "Active"
