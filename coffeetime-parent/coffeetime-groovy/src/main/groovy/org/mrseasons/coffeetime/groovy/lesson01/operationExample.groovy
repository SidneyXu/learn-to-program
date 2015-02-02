package org.mrseasons.coffeetime.groovy.lesson01

/**
 * Created by mrseasons on 2015/2/2.
 */
//安全引用操作符
//old
List<Person> people = [null, new Person(name: "Jack")]
for (Person person : people) {
    if (person != null) {
        println person.name
    }
}
//output
//Jack
println()

//new
for (Person person : people) {
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

