fun main(args:Array<String>) {
    println("Please enter a number")
    val input = readLine() ?: "0"
    val number = input.toDouble()

    val pi = 3.14159
    val result = number * pi

    println("$result is a ${result::class.java}")
}

