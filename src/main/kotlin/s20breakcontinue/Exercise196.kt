package s20breakcontinue

fun main() {
    while (true) {
        println("Please enter your age to enter")
        val input = readlnOrNull() ?: "0"
        if (input == "stop") {
            break
        }
        val age = input.toInt()
        if (age < 18) {
            println("Sorry you are not allowed to enter")
            continue
        }
        println("Welcome please enter")
    }
}