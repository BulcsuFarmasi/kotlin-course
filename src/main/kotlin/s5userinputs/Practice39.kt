package s5userinputs

fun main(args:Array<String>) {
    //println("What is your name?")
    // val userName = readLine()
  //  println("Welcome, $userName")

    println("Please enter a number")
    val number = readlnOrNull() ?: ""
    val result = number.toInt() * 5
    println("$number * 5 = $result")
}
