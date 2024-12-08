fun main(args:Array<String>) {
    // First exercise
//    var a = 76.254
//    var b = 3.867
//
//    println(a + b)
//    println(a - b)
//    println(a * b)
//    println(a / b)
//    println(a % b)
// Second exercise
//    var meatPricePerKg = 29.99
//    var quantity = 1F / 3
//    println("The price of the meat is: ${meatPricePerKg * quantity}")
    // Third exercise
    println("Please enter the amount in your bank account")

    val amountInput = readlnOrNull() ?: "0"
    val amount = amountInput.toDouble()

    println("Congratulations, you now have ${amount * 3}")

}