fun main() {
    val names = arrayListOf("Arthur", "Barry", "Bruce", "Joe", "Lois")

    val messages = getMessages(names) { name -> "Hello $name how are you" }

    println(names)
    println(messages)

    for (i in 0..<names.size) {
        println("Message for ${names[i]}")
        println(messages[i])
        println()
    }
}

fun getMessages(names: ArrayList<String>, greeter: (String) -> String): ArrayList<String> {
    val messages = arrayListOf<String>()
    for (name in names) {
        messages.add(greeter(name))
    }
    return messages
}

