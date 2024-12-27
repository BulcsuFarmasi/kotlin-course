package s27objectorientedprogramming

fun main() {

}

class Car {
    var model: String? = null
    var topSpeed = 100

    fun start() {
        println("Starting at the $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed of $speed")
    }
}