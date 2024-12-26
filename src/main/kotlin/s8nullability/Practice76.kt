package s8nullability

fun main() {
    var a: String? = "I like dogs"

    println(a?.substring(3,6))

    var b:Double? = 34.31
    b = b?.times(6)
    var c = b?.toFloat()
    println(c)

    var userName = readlnOrNull()

    println(userName?.length)
}

