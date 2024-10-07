fun main() {
    println("Please enter an animal")

    val animal = readlnOrNull() ?: "0"
    val animalLifespan = calculateLifespan(animal)

    println("A(n) $animal can live up to $animalLifespan years")
}

fun calculateLifespan(animal: String): Int {
    return when (animal) {
        "cat" -> 15
        "dog" -> 10
        "rabbit" -> 12
        else -> 20
    }
}