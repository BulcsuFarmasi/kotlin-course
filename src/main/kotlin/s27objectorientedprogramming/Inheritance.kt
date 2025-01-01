package s27objectorientedprogramming

fun main() {
    val doggy = Corgi()
    doggy.size = 10
    println(doggy.size)
    doggy.bark()
    doggy.play()
}

open class Dog {
    var size = 0

    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Play")
    }
}

class Corgi : Dog()