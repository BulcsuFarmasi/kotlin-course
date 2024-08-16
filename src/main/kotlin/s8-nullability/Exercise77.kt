fun main () {
    println("Please input a number")

    var numberInput = readLine()
    var number = numberInput?.toDouble()

    number = number?.times(7)

    var numberText = number.toString()

    print(numberText.length)
}
