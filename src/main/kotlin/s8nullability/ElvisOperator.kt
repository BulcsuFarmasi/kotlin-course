package s8nullability

fun main() {
    var catName: String? = null
   // catName = "Fluffy"
    println(catName ?: "This cat has no name")
    println(catName?:"Fluffy".length)
}

