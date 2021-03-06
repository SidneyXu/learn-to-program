package org.mrseasons.coffeetime.groovy._12_class

/**
 * Created by mrseasons on 2015/1/29.
 */
class SongExample {

    static void main(args) {
        //default constructor
        def song = new Song(artist: "Peter", name: "Hello World")

        println song.show()                 //Hello World:PETER

        //implicit setter and getter
        song.name = "Good Byte Java"
        song.setName("How are you")

        // actual use setter
        song.artist = "Tim"
        println(song.artist)                //TIM

        // automatically return last sentence
        println(song.getInfo())             //How are you and TIM,null

        //null point
//        println song.genre.toUpperCase()
        println song.genre?.toUpperCase()   //null

    }
}
