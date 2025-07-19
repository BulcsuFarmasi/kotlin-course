package s30interfaces

fun main() {
    val oven: Oven = getOven()

    oven.turnOn()
    oven.cook(150)
    oven.turnOff()
}

class Bosch : Oven {
    override val temperature: Int = 180

    override fun turnOn() {
        println("turning on")
    }

    override fun turnOff() {
        println("turning off")
    }

}

fun getOven(): Oven {
    return Bosch()
}