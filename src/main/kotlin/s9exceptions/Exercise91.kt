fun main() {
    println("What do you want to buy?")

    try {
        val productName = readlnOrNull()
    } catch (e:Exception) {
        println("Invalid name")
        e.printStackTrace()
    }

    println("How many do you want to buy?")

    val input = readlnOrNull()

    try {
        val productCount = input?.toInt()
        val productPrice = 9.99
        println("The total of your purchase is ${productCount?.times(productPrice)}")
    } catch (e:Exception) {
        println("Invalid quantity")
        e.printStackTrace()
    } finally {
        println("Tracation completed")
    }
}