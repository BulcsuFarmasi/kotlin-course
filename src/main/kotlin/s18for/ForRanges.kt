package s18for

fun main() {
    for (i in 1..3) {
        println("Strike $i")
    }
    println("You're out")

    for (i in 10 downTo 0) {
        println(i)
        when (i) {
            9 -> println("Start your engines")
            6 -> println("on your marks")
            3 -> println("Get set")
            0 -> println("Go!")
        }
    }

    for (i in 100 downTo -100 step 2) {
        println(i)
    }
}
