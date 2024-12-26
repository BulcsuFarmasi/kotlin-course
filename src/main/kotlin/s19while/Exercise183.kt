package s19while

fun main() {
    println("Please enter a large integer")
    val input = readlnOrNull() ?: "0"
    val number = input.toLong()

    var index = 1L
    while (index < number) {
        if (index % 7L == 0L) {
            println("$index is divisible by 7")
        }
        index++
    }
}