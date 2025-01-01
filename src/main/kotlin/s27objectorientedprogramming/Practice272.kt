package s27objectorientedprogramming

fun main() {
    val laptop = Laptop()
    val apple = Apple()

    apple.screenSize = 13
    apple.name = "Apple Macbook"

    laptop.run()
    apple.run()
}

open class Laptop {
    var screenSize = 15
    var speed = 1200
    var name = "Generic laptop"

    fun run() {
        println("Running laptop $name with screen size of $screenSize and speed of $speed")
    }
}

class Apple : Laptop()