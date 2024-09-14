fun main () {
    val numbers = hashSetOf(3, 7, 4, 6)
    val newNumbers = setOf(7,2, 9, 6)

    println(numbers.intersect(newNumbers))

    numbers.clear()

    println(numbers)
    println(numbers.isEmpty())
}