fun main() {
    println("Do you have the keys?")
    val input = readlnOrNull() ?: ""
    val hasKeys = input.toBoolean()

    if (hasKeys) {
        println("Start the car")
    } else {
        println("Cannot start the car without keys")
    }
}