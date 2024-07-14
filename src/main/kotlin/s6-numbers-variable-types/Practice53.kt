fun main(args:Array<String>) {
    println("Please enter a number")
    val numberInput = readLine()?:"0"
    val myByte = numberInput.toByte()
    println(myByte)
    println(myByte::class.java)

    val myShort = myByte.toShort()
    println(myShort::class.java)
}

