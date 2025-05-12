package s29oopprinciples

fun main() {
    val bosch: Oven = Bosch("Bosch", 10, 350)
    val roaster: Oven = Roaster("Roaster", 10, 250)

    bosch.cook()

    roaster.cook()
}

abstract class Oven(name: String, cookingSpeed: Int, topTemperature: Int) {
    abstract fun cook()
}

class Bosch(val name: String, val cookingSpeed: Int, val topTemperature: Int) :
    Oven(name, cookingSpeed, topTemperature) {
    override fun cook() {
        println("The $name cooks with a higher temperature of $topTemperature with the average speed of $cookingSpeed")
    }

}

class Roaster(val name: String, val cookingSpeed: Int, val topTemperature: Int) :
    Oven(name, cookingSpeed, topTemperature) {
    override fun cook() {
        println("The $name oven not cooks but roasts with average temperature of $topTemperature with the average speed of $cookingSpeed")
    }

}