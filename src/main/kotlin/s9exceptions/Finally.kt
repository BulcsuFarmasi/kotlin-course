fun main () {
    val test = readlnOrNull()
    try {
        println(test?.toInt())
    } catch (e:Exception) {
        e.printStackTrace()
        println("An exception happened \n ${e.localizedMessage}")
    } finally {
        println("The execution has completed")
    }
}

