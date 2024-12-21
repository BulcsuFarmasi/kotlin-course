package s22morefunctions

fun main() {
    println(sum(4, 8, 5, 2, 6, 43, 3, 5, 6))
    println(sum(8, 4, 76, 32, 2, 23, 56, 67))
    println(sum(3, 7, 3, 45, 78, 34, 23, 7))
}

fun sum(vararg numbers: Int): Int {
    var sum = 0

    for (number in numbers) {
        sum += number
    }
    return sum
}