package s28moreclasses

fun main() {
    val tableSize = TableSize()
    tableSize.printInfo()
    tableSize.updateDimensions(200, 300)
    tableSize.printInfo()
}

class TableSize {
    var height = 0
    var width = 0

    fun printInfo() {
        println("table dimensions: $width, $height")
    }

    fun updateDimensions(height: Int, width: Int) {
        this.height = height
        this.width = width
    }
}