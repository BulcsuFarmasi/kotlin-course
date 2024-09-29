fun main() {
//    val guestList = setOf("John", "Alice", "Bob", "Carol")
//    println("Please enter your name")
//    val guest = readLine()?:""
//
//    if (guest in guestList) {
//        println("Hi $guest, please come in")
//    } else {
//        print("Sorry you're not on the guest list")
//    }
//    println("How many cats do you have?")
//    val input = readLine() ?: "0"
//    val cats = input.toInt()
//    val howMany = if (cats == 0) "no cats"
//    else if (cats in 1..3)
//        "few cats"
//    else if (cats in 4..6)
//        "several cats"
//    else
//        "many cats"

//    println("This lady has $howMany")

    val animals = arrayListOf<String>("cat", "dog")

    if (animals.isEmpty()) {
        println("Thank you for giving homes to all our pets")
    } else {
        println("Please come in and adopt a cat. We have $animals")
    }
}