package s27objectorientedprogramming

fun main() {
    val cat = Animal()

    cat.run()

    cat.name = "Cat"
    cat.topSpeed = 40

    cat.run()
}

class Animal {
    var name = "An animal"
    var topSpeed = 0

    fun run() {
        println("$name's top speed is $topSpeed")
    }
}