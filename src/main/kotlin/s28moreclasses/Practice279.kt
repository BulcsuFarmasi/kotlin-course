package s28moreclasses

fun main() {
    val table1 = Table()
    val table2 = Table(1)
    val table3 = Table(6, 175)

    table1.printInfo()
    table2.printInfo()
    table3.printInfo()
}

class Table {
    constructor() {
        legs = 3
        height = 200
    }

    constructor(newLegs: Int) {
        legs = newLegs
        height = 130
    }

    constructor(newLegs: Int, newHeight: Int) {
        legs = newLegs
        height = newHeight
    }

    fun printInfo() {
        println("This table has $legs and a height of $height")
    }

    var legs = 4
    var height = 120
}