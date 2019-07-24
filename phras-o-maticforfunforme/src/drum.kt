class DrumKit (var hasTopHat: Boolean, var hasSnare: Boolean){
    fun playSnare() {
        println("ding ding ba-ba-ding!")
    }
    fun playTopHat(){
        println("bang bang bang!")
    }
}

fun main (args: Array<String>) {
    val d = DrumKit(true, true)
    d.playSnare()
    d.playTopHat()
    d.playSnare()
}