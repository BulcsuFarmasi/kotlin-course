package s7operatorsbooleans

fun main(args:Array<String>) {
    val expr1 = 5.374 * 9.5847
    val expr2 = 3.237 * 15.3726

    println("Is $expr1 greater then $expr2: ${expr1 > expr2}")

    val expr3 = ((true && false) || (true || false))
    println(expr3)

    val expr4 = !((3 >= 3) && (false || (2 < 5)))
    println(expr4)

    val toys = 2
    val brokenToys = 1

    val notBroken = toys - brokenToys

    val canGetNewToy = (toys < 5 && notBroken >= 1)

    println("Will the child get a new toy? $canGetNewToy")
}