package s7operatorsbooleans

import kotlin.math.pow

fun main(args:Array<String>) {
    println("Please enter the amount in your  bank account")

    val amountInput = readlnOrNull() ?: "0"
    val amount = amountInput.toDouble()

    val increasedAmount = amount *  1.055.pow(10)

    println("Your amount after interest is: $increasedAmount")
}

