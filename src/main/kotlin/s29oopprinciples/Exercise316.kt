package s29oopprinciples

fun main() {
    val tv = TV()
    tv.showSubtitles()
    tv.showChannelInfo()
    tv.showPrograms()
    tv.showPrograms("11:00")
    tv.showPrograms("12:30")
    tv.showPrograms("15:00")
    tv.showPrograms("19:00")
}

class TV {

    fun showSubtitles() {
        println("This is subtitle")
    }

    fun showChannelInfo() {
        println("This is Channel 3")
    }

    fun showPrograms() {
        println(listOf("Watson", "Futurama", "The Big Bang Theory", "Our Little Village"))
    }

    fun showPrograms(time: String) {
        when (time) {
            "11:00" -> println("Watson")
            "12:30" -> println("Futurama")
            "15:00" -> println("The Big Bang Theory")
            else -> println("Our Little Village")
        }
    }
}