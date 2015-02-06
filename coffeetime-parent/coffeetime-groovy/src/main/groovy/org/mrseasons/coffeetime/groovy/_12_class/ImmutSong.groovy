package org.mrseasons.coffeetime.groovy._12_class

import groovy.transform.Immutable

/**
 * Created by mrseasons on 2015/2/1.
 */
@Immutable
class ImmutSong {
    String name
    String artist
    String genre

    def show(){
        artist
    }
}
