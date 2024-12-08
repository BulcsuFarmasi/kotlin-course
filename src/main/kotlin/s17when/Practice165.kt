fun main() {
//    println("How many meals do you have a day")
//    val input = readLine()?:"3"
//    val meals = input.toInt()
//    when(meals) {
//        in 0..2 -> println("You should eat more")
//        3 -> println("That's perfect")
//        else -> println("You should eat less")
//    }
    println("What is the current hour? (0-23)")
    val input = readlnOrNull() ?: "0"
    var hour = input.toInt()

    if (hour > 23) hour = 23

    val timeOfDay = when (hour) {
        in 6..11 -> "Morning"
        in 12..14 -> "Noon"
        in 15..17 -> "Afternoon"
        in 18..21 -> "Evening"
        else -> "Night"
    }

    println("At $hour:00 it's $timeOfDay")
}