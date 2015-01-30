<<<<<<< HEAD
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
=======
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
>>>>>>> 213870f000b360792a686ff1949b111205e5fd6e
