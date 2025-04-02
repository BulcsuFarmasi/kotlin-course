package s29oopprinciples

fun main() {

}

open class Airplane {
    private val type = "Airbus"

    private fun fly() {
        println("Flying")
    }
}

class MyAirplane : Airplane() {
    fun takeOff() {
        println(type)
        fly()
    }
}

class MyCar {
    fun start() {
        val airplane = Airplane()
        println(airplane.type)
        airplane.fly()
    }
}