import java.util.*

fun main(args:Array<String>) {
    val myPet = "Crocodile"
    println(myPet.length)

    val myName = "michelle"
    println(myName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
    println(myName.replaceFirstChar { it.uppercaseChar()})

    val myAnimal = "Giraffe"
    println(myAnimal.replaceFirstChar { it.lowercase(Locale.getDefault()) })
    println(myAnimal.replaceFirstChar { it.lowercaseChar() })

    val myText = "        here are too    many spaces  "
    println(myText.trim())

    println(myPet.get(3))

    println(myPet[3])

    println(myPet.substring(3))
    println(myPet.substring(3, 6))

}
