fun main() {
    val ints = listOf(23, 44, 92, 55, 66, 27, 913, 45, 34, 11)

    val subset = ints.map { if (it % 2 == 0) it / 2 else it * 2 }.filter { it > 25 }

    println(subset)

}