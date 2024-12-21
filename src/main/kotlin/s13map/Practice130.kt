package s13map

fun main () {
    var count = hashMapOf(Pair(1, "un"), Pair(2, "deux"), Pair(3, "trois"))

    println("2 is in French is ${count[2]}")
    println("3 is in French is ${count[3]}")

    count.put(4, "quatre")
    println(count)

    val customers = hashMapOf(Pair("John", 1), Pair("Alice", 5), Pair("Bob", 3))

    println("Is Alice a customer? : ${customers.containsKey("Alice")}")
    println("Alice bought ${customers["Alice"]} products")
    println("Is Michael a custumer? : ${customers.containsKey("Michael")}")
}