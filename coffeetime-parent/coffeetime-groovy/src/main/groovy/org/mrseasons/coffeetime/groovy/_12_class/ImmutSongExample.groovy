package org.mrseasons.coffeetime.groovy._12_class

/**
 * Created by mrseasons on 2015/2/1.
 */
class ImmutSongExample {

    static void main(args) {
        ImmutSong song = new ImmutSong(artist: "Peter")
//        song.name="Hello"
//        song.artist="Jack"
        println song.show()     //Peter
    }
}
