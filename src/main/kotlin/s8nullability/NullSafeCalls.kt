package s8nullability

fun main() {
    var catName:String? = "Chonkers"
    println(catName?.length?.toString())

    catName = null

    println(catName?.length?.toString())
}