package org.mrseasons.coffeetime.groovy.support

/**
 * Created by mrseasons on 2014/12/30.
 */
class Toy implements Serializable {
    def toyName
    def unitPrice

    String toString() {
        return toyName + ":" + unitPrice;
    }
}
