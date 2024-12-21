package s18for

fun main() {
    println("Please enter a number")
    val input = readlnOrNull() ?: "0"
    val maxValue = input.toInt()

    for (i in 1..maxValue) {
        for (j in 1..maxValue) {
            val multiply = i * j
            val message = if (multiply % 3 == 0) {
                "\uD83D\uDE00"
            } else if (multiply % 3 == 1) {
                "\uD83E\uDD28"
            } else {
                "\uD83D\uDE31"
            }
            print("$message ")
        }
        println()
    }
}