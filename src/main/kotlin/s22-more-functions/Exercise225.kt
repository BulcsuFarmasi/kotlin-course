fun main() {
    printName()
}

fun printName() {
    fun greetName(name: String) {
        println("Hello $name")
    }

    var inputEnded = false

    while (!inputEnded) {
        println("Please enter a name")

        val name = readlnOrNull() ?: ""

        if (name.isNotEmpty()) {
            greetName(name)
        } else {
            inputEnded = true
        }
    }
}