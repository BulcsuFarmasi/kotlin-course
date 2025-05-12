package s29oopprinciples

fun main() {
    val pug: Dog = Pug("pug")
    val bassetHound: Dog = BassetHound("basset hound")
    val chihuahua: Dog = Chihuahua("chihuahua")

    pug.play()
    pug.bark()
    pug.run()

    bassetHound.play()
    bassetHound.bark()
    bassetHound.run()

    chihuahua.play()
    chihuahua.bark()
    chihuahua.run()

}

abstract class Dog(name: String) {
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}

class Pug(val name: String) : Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name cannot bark")
    }

    override fun play() {
        println("A $name can play")
    }

}

class BassetHound(val name: String) : Dog(name) {
    override fun run() {
        println("A $name cannot run")
    }

    override fun bark() {
        println("A $name can bark")
    }

    override fun play() {
        println("A $name can play")
    }
}

class Chihuahua(val name: String) : Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name can definitely bark")
    }

    override fun play() {
        println("A $name cannot play")
    }

}