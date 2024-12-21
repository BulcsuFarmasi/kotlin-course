package s8nullability

fun main () {
//    println("Input a message")
//    val message = readLine()
//    println(message ?: "Hi how are you")

    println("Input a number")
    val input = readlnOrNull()
    val number = input?.toInt()
    println("$number multiplied by 5 is ${number!! * 5}")
}

