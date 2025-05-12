package s29oopprinciples

fun main() {
    val son = Son()
    son.printName()
}

open class Father {
    open val firstName = "Val"
    val lastName = "Kilmer"

    open fun printName() {
        println("$firstName $lastName")
    }
}

class Son : Father() {
    override val firstName = "Jack"

    override fun printName() {
        super.printName()
        println("${super.firstName} ${super.lastName}")
    }
}