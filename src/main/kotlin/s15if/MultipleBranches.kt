package s15if

fun main() {
    println("Please enter an animal")
    val animal = readlnOrNull() ?: "cat"

    val action = if (animal == "dog") {
        "pet it"
    } else if (animal == "cat") {
        "feed it"
    } else if (animal == "crocodile") {
        "run away"
    } else {
        "google it"
    }

    println("if you encounter a $animal you should $action")
}