package s21function

fun main() {
    for (i in 1..3) {
        printNameAndAge()
    }
}

fun printNameAndAge() {
    println("Please enter your name")
    val name = readlnOrNull() ?: ""

    println("Please enter your birth year")
    val input = readlnOrNull() ?: "0"
    val birthYear = input.toInt()

    val ageAfterBirthday = 2024 - birthYear
    val ageBeforeBirthday = ageAfterBirthday - 1

    println("Your name is $name and your age is $ageBeforeBirthday or $ageAfterBirthday")
}