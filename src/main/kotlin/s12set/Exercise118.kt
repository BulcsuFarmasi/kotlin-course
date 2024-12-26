package s12set

fun main () {
    val customers = hashSetOf("Alexandra", "Mary", "William", "Adrienne")

    customers.add("Edward")

    println(customers)


    customers.remove("Alexandra")

    println(customers)

}

