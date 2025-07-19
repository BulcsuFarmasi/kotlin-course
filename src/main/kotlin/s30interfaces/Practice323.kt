package s30interfaces

fun main() {
    val factory = CarFactory()
    val car: Car = factory.provideCar()

    car.speed = 90
    car.drive()
    car.park()
}

interface Car {
    var speed: Int
    fun drive()
    fun park()
}

class BMW : Car {
    override var speed: Int = 250

    override fun drive() {
        println("BMW is driving at $speed kmh")
    }

    override fun park() {
        println("BMW is parking")
    }

}

class CarFactory {
    fun provideCar(): Car {
        return BMW()
    }
}