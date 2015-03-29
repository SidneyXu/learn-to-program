package org.mrseasons.coffeetime.groovy._04_operator

/**
 * Created by mrseasons on 2/5/15.
 */
//Operators
assert 4 + 3 == 7    //4.plus(3)
assert 4 - 3 == 1    //4.minus(3)
assert 4**3 == 64    //4.power(3)
assert 4 / 3 == 1.3333333333    //4.div(3)
assert 4.intdiv(3) == 1
assert 4 > 3    //4.compareTo(3)
assert 4 <=> 3 == 1    //4.compareTo(3)

//Equals
Integer x = new Integer(2)
Integer y = new Integer(2)
Integer z

println x == y      //true
println x.is(y)     //false
println z == null   //true
println z.is(null)  //true

//Safe Navigation Operator
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

//Elvis Operator
//old
String agentStatus = "Active"
String status = agentStatus != null ? agentStatus : "Inactive"
assert status == "Active"

//new
//from other type to boolean automatically
status = agentStatus ? agentStatus : "Inactive"
assert status == "Active"

status = agentStatus ?: "Inactive"
assert status == "Active"
