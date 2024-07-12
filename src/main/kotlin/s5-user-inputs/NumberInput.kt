fun main(args:Array<String>) {
    println("Input a number")
    val userInput = readLine() ?: ""
    println("You wrote: ${userInput.toInt() * 2}")
}

