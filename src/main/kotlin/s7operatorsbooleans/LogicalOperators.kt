package s7operatorsbooleans

fun main(args:Array<String>) {
    val isDay = true
    val isEvening = true
    println(isDay && isEvening)

    println(false || false)

    val isNight = !isDay
    println(isNight)
}

