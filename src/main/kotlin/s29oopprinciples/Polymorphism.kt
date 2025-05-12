package s29oopprinciples

fun main() {
    val mom = MyMom()
    val daughter = MyDaughter()

    mom.say("hi")
    mom.say(6)
    mom.say()
    mom.say("hi", 7)

    daughter.say("hi")
}

open class MyMom {
    open fun say(message: String) {
        println("Mom says $message")
    }

    fun say(times: Int) {
        for (i in 1..times) {
            println("Mom says hello")
        }
    }

    fun say() {
        println("mom says hi how are you")
    }

    fun say(message: String, times: Int) {
        for (i in 1..times) {
            println("Mom says $message")
        }
    }
}

class MyDaughter : MyMom() {
    override fun say(message: String) {
        println("Daughter says $message")
    }
}