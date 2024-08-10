fun main(args:Array<String>) {
    val farmer = 1
    val animals = 3
    val producingAnimals = 1
    val children = 2

    val canGetFounding = animals < 5 && producingAnimals >= 1 && farmer + children >= 3

    println("Can get the farmer get founding? $canGetFounding")

}