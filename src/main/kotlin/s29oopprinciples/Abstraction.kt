package s29oopprinciples

fun main() {
    val container: Container = Bottle()

    container.pour()
}

abstract class Container {
    abstract fun pour()
}

class Bottle : Container() {
    override fun pour() {
        println("Pouring bottle")
    }
}

class Jug : Container() {
    override fun pour() {
        println("Pouring jug")
    }
}