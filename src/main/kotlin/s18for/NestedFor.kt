package s18for

fun main() {
    val matrixSize = 9
    for (i in 0..matrixSize) {
        for (j in 0..matrixSize) {
            if (i == j) {
                print("diagonal \t")
            } else {
                print("$i $j   \t\t")
            }
        }
        println()
    }
}