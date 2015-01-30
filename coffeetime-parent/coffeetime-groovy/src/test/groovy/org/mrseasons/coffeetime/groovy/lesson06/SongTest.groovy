package org.mrseasons.coffeetime.groovy.lesson06

/**
 * Created by mrseasons on 1/30/15.
 */
class SongTest extends GroovyTestCase {

    public void testToString(){
        Song song=new Song(artist: "Peter")
        song.setName("Hello")
        assertEquals("Peter",song.artist)
        assertEquals("Hello",song.getName())
    }
}
