fun main(args:Array<String>) {
    println("Please input a number")
    val input = readLine() ?: ""
    val number = input.toInt()

    val fraction = 9.429

    val multiply = number * fraction
    println(multiply)
    println(multiply::class.java)
}
