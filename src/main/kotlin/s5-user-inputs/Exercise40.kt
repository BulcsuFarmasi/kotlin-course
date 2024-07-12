fun main(args:Array<String>) {
    println("What is your year of birth")
    val userYear = readLine() ?: ""
    val year = userYear.toInt()

    val currentYear = 2024

    val userAge = currentYear - year

    println("Your age is either ${userAge - 1} or $userAge")

}

