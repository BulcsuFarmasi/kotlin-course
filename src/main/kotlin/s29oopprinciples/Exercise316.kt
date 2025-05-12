package s29oopprinciples

fun main() {
    val tv = TV()
    tv.showChannelInfo("Ch 3")
    tv.showChannelInfo("Ch 3", true)
    tv.showChannelInfo("Ch 3", false)
    tv.showPrograms()
    tv.showPrograms("11:00")
    tv.showPrograms("12:30")
    tv.showPrograms("15:00")
    tv.showPrograms("19:00")
}

class TV {


    fun showChannelInfo(channelId: String) {
        println("This is $channelId")
    }

    fun showChannelInfo(channelId: String, subtitles: Boolean) {
        println("This is $channelId")
        if (subtitles)
            print("with subtitles")
        else
            print("without subtitles")
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