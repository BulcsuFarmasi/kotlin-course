package s9exceptions

fun main() {
    var test = readlnOrNull()
    throw IllegalStateException("I don't like this input")
}