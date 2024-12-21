package s17when

fun main() {
    val animal = "dog"
    val action = when (animal) {
        "cat" -> "pet it"
        "dog" -> {
            println("Yay I meet a dog")
            "feed it"
        }

        else -> "google it"
    }

    println("If you meet a $animal you should $action")

    val month = "April"
    val days = when (month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }
    println("The month of $month has $days days")
}