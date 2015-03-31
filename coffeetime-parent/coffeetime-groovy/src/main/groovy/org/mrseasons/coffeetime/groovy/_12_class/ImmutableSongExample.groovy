package org.mrseasons.coffeetime.groovy._12_class

/**
 * Created by mrseasons on 2015/2/1.
 */
class ImmutableSongExample {

    static void main(args) {
        ImmutableSong song = new ImmutableSong(artist: "Peter")
//        song.name="Hello"
//        song.artist="Jack"
        println song.show()     //Peter
    }
}
