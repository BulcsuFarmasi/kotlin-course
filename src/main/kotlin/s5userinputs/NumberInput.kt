fun main(args:Array<String>) {
    println("Input a number")
    val userInput = readlnOrNull() ?: ""
    println("Double is: ${userInput.toInt() * 2}")
}

