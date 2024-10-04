fun main() {
    val onlyEvenNumbers = arrayListOf(2, 8, 4, 7, 6, 10)
    for (number in onlyEvenNumbers) {
        if (number % 2 != 0) break
        println("Half of $number is ${number / 2}")
    }
}