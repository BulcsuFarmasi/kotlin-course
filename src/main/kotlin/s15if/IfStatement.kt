package s15if

fun main() {
//    println("Input a boolean value. Is it night time?")
//    val input = readLine()?:"true"
//    val night = input.toBoolean()
//
//    if (night) {
//       println("Sleep, it's night time")
//    } else {
//        println("Be active, it's day time")
//    }

    println("Please input how much money do you have")
    val input = readlnOrNull() ?: "0"
    var clientFunds = input.toInt()
    val price = 50
    var clientProducts = 0

    if (clientFunds > 50) {
        clientFunds -= price
        clientProducts += 1
        println("You have successfully purchased $clientProducts product")
        println("You have $clientFunds funds")
    } else {
        println("You have insufficient funds")
    }
}