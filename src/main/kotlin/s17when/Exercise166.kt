package s17when

fun main() {
    println("Please input your name")
    val name = readlnOrNull() ?: ""

    val message = when (name[0]) {
        'A', 'B', 'C' -> "You, $name are punctual"
        'D', 'E', 'F' -> "You, $name have good manners"
        else -> "You, $name have good hygiene"
    }
    println(message)
}

