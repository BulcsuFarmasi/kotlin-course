fun main() {
    println("What year is it?")
    val input = readlnOrNull() ?: "0"
    val year = input.toInt()

    for (i in 1..12) {
        val day = when (i) {
            1 -> 31
            2 -> if (year % 4 == 0) 29 else 28
            3 -> 31
            4 -> 30
            5 -> 31
            6 -> 30
            7 -> 31
            8 -> 31
            9 -> 30
            10 -> 31
            11 -> 30
            else -> 31
        }
        println("For the month $i in year $year there are $day days")
    }
}
