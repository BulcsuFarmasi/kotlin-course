package s17when

fun main() {
    val animal = "kangaroo"
    var action = ""

    when (animal) {
        "cat" -> {
            action = "pet it"
        }

        "dog" -> {
            action = "feed it"
        }

        else -> {
            action = "google it"
        }
    }

    println("When you meet a $animal you should $action")

    var result = ""
    val number = 2344

    when (number % 2) {
        0 -> result = "Number is even"
        1 -> result = "Number is odd"
    }

    println(result)
}