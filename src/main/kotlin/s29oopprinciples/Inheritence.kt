package s29oopprinciples

fun main() {
    val carol = Daughter("French")
    println(carol.hairColor)
    carol.say("Hi")
}

open class Mom(nativeTongue: String) {
    open val hairColor = "Brown"
    open val eyeColor = "Blue"

    open fun say(message: String) {
        println("mom says $message")
    }
}

class Daughter(nativeTongue: String) : Mom(nativeTongue) {
    override val hairColor = "Blonde"
    override val eyeColor = "Green"

    override fun say(message: String) {
        println("daughter says $message")
        super.say(message)
        println("Mother has ${super.hairColor}")
        println(eyeColor)
        println(super.eyeColor)
    }
}