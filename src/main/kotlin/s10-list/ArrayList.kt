fun main() {
    val colors = arrayListOf("blue", "green")
    println(colors)

    val noColors = arrayListOf<String>()
    println(noColors)


    colors.add("yellow")

    println(colors)

    val moreColors = arrayListOf("pink", "teal")

    colors.addAll(moreColors)

    println(colors)

    colors.remove("blue")

    println(colors)

    colors.removeAll(moreColors)

    println(colors)

    colors.removeAt(1)

    println(colors)

    colors.add("red")
    colors.add("green")

    println(colors)

    colors.remove("green")

    println(colors)
}

