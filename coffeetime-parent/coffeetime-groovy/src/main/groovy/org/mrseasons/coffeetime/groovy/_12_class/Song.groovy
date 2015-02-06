package org.mrseasons.coffeetime.groovy._12_class

/**
 * Created by mrseasons on 2015/1/29.
 */
class Song {
    def name
    def artist
    def genre

    def show() {
        "${name}:${artist}"
    }

    String getInfo() {
        "${name} and ${artist},${getGenre()}"
    }

    def setArtist(p) {
        artist = p.toUpperCase()
    }

    @Override
    String toString() {
        return "${name}:${artist}"
    }
}
