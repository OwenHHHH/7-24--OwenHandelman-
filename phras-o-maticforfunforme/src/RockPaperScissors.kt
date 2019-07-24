import kotlin.random.Random

fun main() {
    println("Welcome to Rock Paper Scissors")
    var playagain = true

    while (playagain) {
        displaywelcomeMessage()
        val userinput = readLine() ?: ""
        val verifiedInput: String = if (userinput == "") "0" else userinput
        val userint = verifiedInput.toInt()
        val computerinput = Random.nextInt(1, 3)
        playagain = playGame(userint, computerinput)
    }

}

fun playGame(userinput: Int, computerinput: Int):Boolean {
    println("You chose ${userinput} and I chose ${computerinput}")
    val result = when (userinput) {
        computerinput -> "You tied!"
        1 -> if (computerinput == 2) "you loose!" else "you won"
        2 -> if (computerinput == 3) "you loose!" else "you won"
        3 -> if (computerinput == 1) "you loose!" else "you won"
        else -> "Exiting"
    }
    println(result)
    return userinput in 1..3
}
private fun displaywelcomeMessage() {
    println("Please enter one of the following numbers")
    println("1 is Rock")
    println("2 is Paper")
    println("3 is scissors")
    println("anything else to exit")
    print("enter your selection")
}


//1.how to play
//2.get user input
//3.actually value games
//eldisplay resullts
//play again