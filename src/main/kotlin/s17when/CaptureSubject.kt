package s17when

fun main() {
    val name = "Jean-Baptiste"
    when (val length = name.length) {
        in 1..5 -> println("A name with $length characters is short")
        in 6..10 -> println("A name with $length characters is medium")
        else -> println("A name with $length characters is long")
    }
}