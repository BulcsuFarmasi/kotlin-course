package s11list

fun main () {
    val colors = listOf("blue", "red", "yellow")

    println(colors)

    val colors2 = listOf<String>()

    println(colors2)

    val colors3 = listOf("blue", "red", "blue", "green", "red", "blue")

    println(colors3)

    val colors4 = listOf("blue", "red", "blue", null, null)

    println(colors4)

    println(colors[0])
    println(colors[1])
  //  println(colors[5])

   println(colors.get(1))

    println(colors3.size)
}

