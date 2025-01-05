package s28moreclasses

fun main() {
    val account = Account()
    account.amount = 9
    account.amount = 5650
    account.amount = 90000
}

class Account {
    var amount = 0
        set(newValue) {
            field = newValue
            var interestRate = when (true) {
                (field < 1000) -> 1.0
                (field < 10000) -> 0.5
                (field >= 10000) -> 0.2
                else -> 1.0
            }
            println("The interest rate is $interestRate")
        }
}