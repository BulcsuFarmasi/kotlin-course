package s29oopprinciples

fun main() {
    val restaurant = Franchise()
    restaurant.prepareBurgers()
}

class Franchise : OriginalRestaurant() {

    fun prepareBurgers() {
        println("Preparing burgers with the secret formula")
        println(applyFormula())
    }
}

open class OriginalRestaurant {


    protected fun applyFormula(): String = "Preparing burgers with love and care"
}