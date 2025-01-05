package s28moreclasses

fun main() {
    val bankAccount = BankAccount()
    bankAccount.account = 300
    bankAccount.account = 400
    bankAccount.account = 100
}

class BankAccount {
    var creditRating = 500
    var account: Int = 0
        set(value) {
            if (value > field) {
                creditRating++
            } else {
                creditRating--
            }
            field = value
            println("New credit rating is $creditRating")
        }
}