fun main() {
//    var i = 0
//
//    while (i < 10) {
//        i++
//        println("$i: Hello")
//    }
//
//    val cats = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")
//
//    var index = 0
//
//    while (index < cats.size) {
//        println("Hello ${cats[index]}")
//        index++
//    }

    println("Please enter a number")
    val input = readlnOrNull() ?: "0"
    val number = input.toInt()
    var i = 1
    var result = 1L
    while (i <= number) {
        result *= i
        i++
    }

    println("$number! = $result")

}