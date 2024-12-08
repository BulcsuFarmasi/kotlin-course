fun main () {
    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")

    animals.add("panda")

    println(animals)

    animals.remove("lion")

    println(animals)

    val requiredAnimals = listOf("elephant", "giraffe")

    println("Has the zoo all the required animals: ${animals.containsAll(requiredAnimals)}")
}