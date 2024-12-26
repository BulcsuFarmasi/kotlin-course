package s8nullability

fun main () {
    val price = 29.99

    println("The price of the product is $price, how many do you want to buy?")

    val input = readlnOrNull()
    val quantity = input?.toInt() ?: 2

    println("The total price is ${price * quantity}")
}

