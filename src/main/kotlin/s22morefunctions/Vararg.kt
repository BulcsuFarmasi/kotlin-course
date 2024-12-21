package s22morefunctions

fun main() {
    sayHello("Alice", "Bob", "Carol", "Dan", "Eric", "Fiona")
}

fun sayHello(vararg names: String) {
    for (name in names) {
        println("Hello $name")
    }
}