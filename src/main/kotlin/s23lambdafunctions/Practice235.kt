fun main() {
    val numbers = setOf(3, 456, 37, 67, 4, 567, 34, 4575)

    println(numbers.filter { it in 10..99 })

    val clients = listOf("Tom", "Laura", "Dennis", "Mark")

    println(clients.sortedBy { it[it.length - 1] })

    val ints = listOf(372, 285, 836, 194, 836, 216)

    println(ints.maxBy { it.toString()[1].code })
    println(ints.maxBy { it / 10 % 10 })
}