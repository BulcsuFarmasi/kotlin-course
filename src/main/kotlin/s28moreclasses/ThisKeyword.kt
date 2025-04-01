package s28moreclasses

fun main() {
    val note = PostItNote()
    println(note.message)
    note.printMessage()
    note.updateMessage("Meeting at five")
    println(note.message)
    note.printMessage()
}

class PostItNote {
    var message: String = "No message"

    fun updateMessage(message: String) {
        this.message = message
    }

    fun printMessage() {
        println(message)
        println(this.message)
    }
}