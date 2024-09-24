fun main() {
    val hasEggs = true
    val hasBacon = true

    val eggPrice = 5
    val baconPrice = 20

    var eggQuantity = 0
    var baconQuantity = 0

    if (hasEggs) {
        eggQuantity = 12
        if (hasBacon) {
            baconQuantity = 2
        }
    } else {
        println("No eggs available")
    }

    print("Total spending: ${eggPrice * eggQuantity + baconPrice * baconQuantity}")
}