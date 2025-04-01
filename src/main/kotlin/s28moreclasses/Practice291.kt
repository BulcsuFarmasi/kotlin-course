package s28moreclasses

fun main() {
    val newLaptop = Laptop("Windows 10")
}

class Laptop(val operatingSystem: String) {
    init {
        println("Operating system $operatingSystem is installing")
    }
}