fun main () {
    val animals = listOf("dog", "cat", "bat", "hippo")

    println(animals.size)

    println(animals[1])

    val customers = arrayListOf("Alex", "John", "Michelle", "Judy")
    println(customers)
    val newCostumer = "Michael"
    customers.add(newCostumer)
    println(customers)
    val leavingCustomer = "John"
    customers.remove(leavingCustomer)

    println(customers)
}

