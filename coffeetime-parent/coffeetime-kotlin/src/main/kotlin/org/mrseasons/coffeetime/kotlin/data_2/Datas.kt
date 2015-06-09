package org.mrseasons.coffeetime.kotlin.data_2

/**
 * Created by mrseasons on 2015/06/09.
 */
//  Data Classes
//  do nothing but hold data
/*  The compiler automatically derives the following members from all properties declared
 *   in the primary constructor
 *
 *  equals()/hashCode()
 *  toString()
 *  componentN()
 *  copy()
*/
data class User(val name: String, val age: Int){
}
