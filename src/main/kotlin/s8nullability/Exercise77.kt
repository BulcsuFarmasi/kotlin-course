fun main () {
    println("Please input a number")

    var numberInput = readlnOrNull()
    var number = numberInput?.toDouble()

    number = number?.times(7)

    var numberText = number.toString()

    print(numberText.length)
}
