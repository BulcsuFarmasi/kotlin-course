package s30interfaces

fun main() {
    val coffeeShop = CoffeeShop()

    var coffee: Coffee?

    for (i in 1..5) {
        coffee = coffeeShop.purchaseCoffee()
        coffee.wakeUp()
        coffee.quenchThirst()
    }
}

interface Coffee {

    fun wakeUp()

    fun quenchThirst()
}

class Arabica : Coffee {
    var name = "Arabica"

    override fun wakeUp() {
        println("$name wakes you up")
    }

    override fun quenchThirst() {
        println("$name quenches your thirst")
    }
}

class Robusta : Coffee {
    var name = "Robusta"

    override fun wakeUp() {
        println("$name wakes you up")
    }

    override fun quenchThirst() {
        println("$name quenches your thirst")
    }
}

class CoffeeShop {
    fun purchaseCoffee(): Coffee {
        val randomNumber = System.currentTimeMillis()
        return if (randomNumber % 2 == 0L) Arabica() else Robusta()
    }
}