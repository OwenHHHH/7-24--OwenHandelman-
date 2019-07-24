class Dog (val name: String, var weight: Int, val breed : String){
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}
var ogdi = Dog("kip", 8090, "gippy")

