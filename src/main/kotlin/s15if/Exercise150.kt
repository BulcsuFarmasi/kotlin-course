package s15if

fun main() {
    println("Please input the points")
    val input = readlnOrNull() ?: "0"
    val point = input.toInt()

    if (point > 100) {
        println("Wrong number")
        return
    }

    val grade = if (point in 90..100) {
        "A"
    } else if (point in 80..89) {
        "B"
    } else if (point in 70..79) {
        "C"
    } else if (point in 60..69) {
        "D"
    } else if (point in 50..59) {
        "E"
    } else {
        "F"
    }

    print(grade)
}