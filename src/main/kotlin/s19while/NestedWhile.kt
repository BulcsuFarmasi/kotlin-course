package s19while

fun main() {
    var i = 1
    var j = 1
    while (i <= 10) {
        while (j <= 10) {
            print("$i, $j\t")
            j++
        }
        i++
        j = 1
        println()
    }
}