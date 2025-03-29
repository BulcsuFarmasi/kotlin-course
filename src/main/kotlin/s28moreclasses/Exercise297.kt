package s28moreclasses

fun main() {
    val editor = Book.getEditor()
    val book = Book(editor)

    println(book.editor.name)
}

class Book(val editor: Editor) {
    companion object {
        fun getEditor(): Editor = Editor("O'Reilly")
    }
}

class Editor(val name: String)