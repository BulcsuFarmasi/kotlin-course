package s28moreclasses

fun main() {
    val box = Box()
    println("Contents is ${box.contents}")
    box.updateContents("Jewelry")
    println("Contents is ${box.contents}")
}

class Box {
    var contents: String = ""

    fun updateContents(contents: String) {
        this.contents = contents
    }
}