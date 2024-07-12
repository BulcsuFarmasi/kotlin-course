fun main(args:Array<String>) {
    println("Input a number")
    val userInput = readLine() ?: ""
    println("Double: ${userInput.toInt() * 2}")
}

