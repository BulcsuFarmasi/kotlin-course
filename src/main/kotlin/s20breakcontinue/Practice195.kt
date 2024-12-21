package s20breakcontinue

fun main() {
//    val animals = arrayListOf<String>()
//    for (i in 1..5) {
//        println("Please enter an animal")
//        val animal = readLine()?:""
//        if (animal == "snake") {
//            println("Sorry we cannot accept snakes")
//            break
//        }
//        animals.add(animal)
//        println("Our current animals: $animals")
//    }
    val clients = listOf("Anna", "Bob", "Carol", "David")

    for (client in clients) {
        if (client[0] == 'C') continue
        println("Hello $client")
    }
}