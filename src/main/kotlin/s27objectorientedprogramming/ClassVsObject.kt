package s27objectorientedprogramming

fun main() {
    val animals: ArrayList<String> = arrayListOf<String>()
    val table = Table()
    println(table.color)
    val garage = Garage()

    garage.vehicle.drive()
}

class Table {
    var color: String = "white"
}

class Vehicle {
    fun drive() {
        println("Driving along in my car")
    }
}

class Garage {
    val vehicle = Vehicle()
}