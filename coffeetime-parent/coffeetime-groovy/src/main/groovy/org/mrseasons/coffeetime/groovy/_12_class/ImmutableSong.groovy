package org.mrseasons.coffeetime.groovy._12_class

import groovy.transform.Immutable

/**
 * Created by mrseasons on 2015/2/1.
 */
@Immutable
class ImmutableSong {
    String name
    String artist

    def show(){
        artist
    }
}
