package s27objectorientedprogramming

fun main() {
    val math = Math()
    println("3 + 7 equals ${math.add(3, 7)}")
    println("7 * 5 equals ${math.mul(7, 5)}")
    println("2 - 6 equals ${math.sub(2, 6)}")
    println("7 / 2 equals ${math.div(7, 2)}")

}

class Math {
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
    fun mul(a: Int, b: Int) = a * b
    fun div(a: Int, b: Int) = a / b
}