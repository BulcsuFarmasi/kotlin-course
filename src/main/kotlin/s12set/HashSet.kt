fun main () {
    val numbers = hashSetOf(3,7,4, null)

    val noNumbers = hashSetOf<Int>()

    println(numbers)
    println(noNumbers)

    numbers.add(44)
    println(numbers)

    val newNumbers = setOf(58, 34, 78)

    numbers.addAll(newNumbers)

    println(numbers)

    numbers.remove(58)

    println(numbers)

    val toRemove = setOf(3,4,8745)

    numbers.removeAll(toRemove)

    println(numbers)
}

