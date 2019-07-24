class Song (val title:String, val artist:String) {
    fun play (){
        println("${title} playing")
    }
    fun stop(){
        println("${title} stopped")
    }
}

fun main () {
    val song1 = Song("Song1", "Bertha")
    val song2 = Song("Song2", "Benny")
    val song3 = Song("Song3", "Clark")

    song2.play()
    song2.stop()
}