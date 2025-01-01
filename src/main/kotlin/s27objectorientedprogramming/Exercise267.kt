package s27objectorientedprogramming

fun main() {
    val calculator = Calculator()

    calculator.storeTotal(15)
    println("Total is now ${calculator.total}")
    calculator.add(33)
    println("Total is now ${calculator.total}")
    calculator.subtract(11)
    println("Total is now ${calculator.total}")
    calculator.multiply(50)
    println("Total is now ${calculator.total}")
    calculator.divide(36)
    println("Total is now ${calculator.total}")
    calculator.resetTotal()
    println("Total is now ${calculator.total}")
}

class Calculator {
    var total = 0

    fun storeTotal(newTotal: Int) {
        total = newTotal
    }

    fun add(number: Int) {
        total += number
    }

    fun subtract(number: Int) {
        total -= number
    }

    fun multiply(number: Int) {
        total *= number
    }

    fun divide(number: Int) {
        total /= number
    }

    fun resetTotal() {
        total = 0
    }
}