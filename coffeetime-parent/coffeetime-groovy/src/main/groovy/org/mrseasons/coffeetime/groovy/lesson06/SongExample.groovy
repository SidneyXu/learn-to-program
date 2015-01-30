<<<<<<< HEAD
package org.mrseasons.coffeetime.groovy.lesson06

/**
 * Created by mrseasons on 2015/1/29.
 */
class SongExample {
    static void main(args) {
        //default constructor
        def song = new Song(artist: "Peter", name: "Hello World")

        //implicit setter and getter
        song.name = "Good Byte Java"
        song.setName("How are you")
//        song.name "Hello Jane"

        // actual use setter
        song.artist = "Tim"
        println(song.artist)        //TIM

        // automatically return last sentence
        println(song.getInfo())     //How are you and TIM,null

        //null point
//        println song.genre.toUpperCase()
        println song.genre?.toUpperCase()   //null

    }
}
=======
package org.mrseasons.coffeetime.groovy.lesson06

/**
 * Created by mrseasons on 1/30/15.
 */
class SongExample {
    static void main(args){
        def sng = new Song(name:"Le Freak",
                artist:"Chic", genre:"Disco")

    }
}
>>>>>>> 213870f000b360792a686ff1949b111205e5fd6e
