package s15if

fun main() {
    val petStore = listOf("dog", "rabbit")
    val hasCatFood = false

    if (petStore.contains("cat")) {
        if (hasCatFood) {
            println("Buy cat and cat food")
        } else {
            println("Buy cat only")
        }
    } else {
        println("Ask pet store owner to get a cat")
    }
}