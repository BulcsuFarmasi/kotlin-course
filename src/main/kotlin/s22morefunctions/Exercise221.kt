package s22morefunctions

fun main() {
    hello(4, "John", "Abraham", "Mike", "Oscar", "Carl")
}

fun hello(count: Int, vararg clients: String) {
    for (client in clients) {
        for (i in 1..count) {
            println("Hello $client")
        }
    }
}