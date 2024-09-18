fun main() {
    println("Do you have the keys? (yes/no)")
    val input = readlnOrNull() ?: ""
    var hasKeys = false

    if (input == "yes") {
        hasKeys = true
    }

    if (hasKeys) {
        println("Start the car")
    } else {
        println("Cannot start the car without keys")
    }

}