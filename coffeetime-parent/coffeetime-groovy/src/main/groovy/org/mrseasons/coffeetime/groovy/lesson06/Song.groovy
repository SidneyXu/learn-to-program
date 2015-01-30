package org.mrseasons.coffeetime.groovy.lesson06

/**
 * Created by mrseasons on 2015/1/29.
 */
class Song {
    def name
    def artist
    def genre

    void setArtist(p) {
        artist = p.toUpperCase()
    }

    String getInfo(){
        "${name} and ${artist},${getGenre()}"
    }
}
