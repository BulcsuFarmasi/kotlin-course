package s20breakcontinue

fun main() {
    val onlyEvenNumbers = arrayListOf(2, 8, 4, 7, 6, 9, 10)
    for (number in onlyEvenNumbers) {
        if (number % 2 != 0) continue
        println("The half of $number is ${number / 2}")
    }
}