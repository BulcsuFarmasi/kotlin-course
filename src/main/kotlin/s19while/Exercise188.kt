package s19while

fun main() {
    val usernames = hashSetOf("john", "bob", "alice")

    var finished = false

    do {
        println("Please enter a user name")
        val username = readlnOrNull() ?: ""
        if (username in usernames) {
            println("The $username username is taken, please choose another")
        } else {
            usernames.add(username)
            println("You've successfully choosen a username: $username")
            finished = true
        }
    } while (!finished)
    println(usernames)
}