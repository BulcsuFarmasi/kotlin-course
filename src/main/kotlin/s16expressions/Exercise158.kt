package s16expressions

fun main() {
    println("Please input your age")
    val input = readlnOrNull() ?: "0"
    var age = input.toInt()

    if (age == 0) {
        age = 1
    }

    val periodOfLife = if (age in 1..12) {
        "a child"
    } else if (age in 13..18) {
        "a teen"
    } else {
        "an adult"
    }

    println("You are $periodOfLife")
}