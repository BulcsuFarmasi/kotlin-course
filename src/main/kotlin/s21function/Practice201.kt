package s21function

fun main() {
    for (i in 1..10) {
        printHello()
    }

    for (i in 1..3) {
        multiplyNumber()
    }
}

fun printHello() {
    println("Hello, how are you")
}

fun multiplyNumber() {
    println("Please enter a number")
    val input = readlnOrNull() ?: "0"
    val number = input.toInt()

    println("$number * 17 = ${number * 17}")

}