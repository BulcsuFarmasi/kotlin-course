package s28moreclasses

fun main() {
    val car = Car3()
}

class Car3 {
    var model = "BMW"
    var topSpeed = 100

    init {
        println("This is car is $model model and has a top speed of $topSpeed")
    }
}

