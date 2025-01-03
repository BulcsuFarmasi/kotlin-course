package s28moreclasses

fun main() {
    val jonathan = UserAccount()
    val mary = UserAccount("Mary")
    val charles = UserAccount("Charles", 63)
    val anna = UserAccount("Anna", 2636)
}

class UserAccount {

    constructor() {
        userName = "Jonathan"
        balance = 48
        canAfford()
    }

    constructor(newName: String) {
        userName = newName
        balance = 18
        canAfford()
    }

    constructor(newName: String, newBalance: Int) {
        userName = newName
        balance = newBalance
        canAfford()
    }


    fun canAfford() {
        val tshirtPrice = 20
        if (balance >= tshirtPrice) {
            println("$userName can afford ${balance / tshirtPrice} t-shirts with the balance $balance")
        } else {
            println("$userName can't afford a t-shirt with the balance $balance")
        }
    }

    var userName: String = "No name"
    var balance: Int = 0

}