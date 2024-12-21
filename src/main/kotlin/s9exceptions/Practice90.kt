package s9exceptions

fun main () {
//    println("Please enter a number")
//    val input = readLine()
//    try {
//        val number = input?.toInt()
//        println("$number * = ${number?.times(5)}")
//    } catch (e:Exception) {
//        println("The value '$input' is not a number")
//        e.printStackTrace()
//    }

    println("Please enter the distance you ran in km")
    val input = readlnOrNull()
    try {
        val distanceKM = input?.toDouble()
        println("$distanceKM km is ${distanceKM?.times(0.62)} miles")
    } catch (e:Exception) {
        println("Cannot read distance")
        e.printStackTrace()
    }
}