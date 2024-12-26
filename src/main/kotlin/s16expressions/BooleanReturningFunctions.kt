package s16expressions

fun main() {
//    val animals = arrayListOf<String>()
//    if (animals.isEmpty()) {
//        animals.add("dog")
//    }
//    println(animals)
    val animals = arrayListOf("cat", "dog")
    if (animals.add("horse")) {
        println("Horse was successfully added")
    }
}