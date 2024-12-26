package s16expressions

fun main() {
    val favouritePet = "dog"
    val availablePets = listOf("dog", "cat", "horse")

    if (favouritePet in availablePets) {
        println("We have your next best friend")
    } else {
        println("Sorry, $favouritePet is not available")
    }

//    println("Enter you favourite coffee")
//
//    val favouriteCoffee = readLine()?:""
//
//    val availableCoffee = listOf("capuccino", "mocha")
//
//    if (favouriteCoffee !in availableCoffee) {
//        println("Sorry, we don't have your favorite coffee")
//    } else {
//        println("$favouriteCoffee is available")
//    }

    println("Please enter a number")
    val input = readlnOrNull() ?: "0"
    val number = input.toInt()

    if (number !in 0..9)
        println("Your number is not single digit")
}