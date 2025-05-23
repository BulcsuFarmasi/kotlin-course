package s12set

fun main () {
    val numbers = setOf(2, 3, 5, 7, 11, 13, 17, 23, 29)

    println("is the number 21 a prime number? : ${numbers.contains(21)}")

    println("is the number 13 a prime number? : ${numbers.contains(13)}")

    val myDrinks = hashSetOf("water", "coke", "beer", "orange juice")

    val theirDrinks = hashSetOf("water", "orange juice", "pineapple juice", "milk")

    myDrinks.retainAll(theirDrinks)

    println("Drinks that we both enjoy $myDrinks")
}