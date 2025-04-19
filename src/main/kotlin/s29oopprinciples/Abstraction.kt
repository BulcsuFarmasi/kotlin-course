package s29oopprinciples

fun main() {
    val container = Bottle()

    container.pour()
    container.fill()
}

abstract class Container {
    fun pour() {
        println("Pouring liquid")
    }
}

class Bottle : Container() {
    fun fill() {
        println("Filling bottle")
    }
}

class Jug : Container()