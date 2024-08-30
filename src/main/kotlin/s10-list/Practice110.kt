fun main () {
    val winners = listOf("Usain", "John", "Michael", "Alex", "Bob")

    println("Micheal finished on position ${winners.indexOf("Michael") + 1}")

    val requiredColors = listOf("red", "green", "blue")
    val availableColor = listOf("red", "blue")

    println("Can print: ${availableColor.containsAll(requiredColors)}")

    val ingredients =  arrayListOf("Chicken", "Egg", "Mozzarella", "Pepper")

    ingredients[ingredients.indexOf("Mozzarella")] = "Blue Cheese"

    println(ingredients)
}
