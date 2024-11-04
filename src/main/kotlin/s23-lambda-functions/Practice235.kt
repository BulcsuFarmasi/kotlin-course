fun main() {
    val numbers = setOf(3, 456, 37, 67, 4, 567, 34, 4575)

    println(numbers.filter { it in 10..99 })
}