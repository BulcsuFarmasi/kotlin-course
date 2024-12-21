package s22morefunctions

fun main() {
    val products = mapOf(Pair("Milk", 3.67), Pair("Cheese", 10.5), Pair("Laptop", 1010.99))

    addTax("coffee", 4.53)
    addTax(products)
}

fun addTax(name: String, price: Double?) {
    val tax = 1.2

    println("$name costs with tax ${price?.times(tax)}")
}

fun addTax(products: Map<String, Double>) {
    for (product in products.keys) {
        addTax(product, products[product])
    }
}