package s30interfaces

fun main() {
    val oven: Oven? = null
    oven?.turnOn()
    oven?.cook(180)
}

interface Oven {
    val temperature: Int

    fun turnOn()
    fun turnOff()
    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }
}