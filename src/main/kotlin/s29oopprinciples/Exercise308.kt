package s29oopprinciples

fun main() {
    val franchise = Franchise()
    franchise.provideBurger()
}

class Franchise {
    private val restaurant = OriginalRestaurant()

    fun provideBurger() {
        val formula = restaurant.getFormula()
        println("Providing")
    }
}

class OriginalRestaurant {
    private val formula = "Formula"

    fun getFormula(): String = formula
}