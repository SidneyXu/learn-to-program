package org.mrseasons.coffeetime.groovy.lesson06

/**
 * Created by mrseasons on 1/30/15.
 */
class Song {
    def name
    String artist
    def genre

    @Override
    String toString() {
        return "${name}:${artist}"
    }
}
