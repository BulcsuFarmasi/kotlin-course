package s29oopprinciples

fun main() {
    val lock = EncryptionLock(40)

    println("Does the key 34 unlocks my lock: ${lock.unlock(34)}")
    println("Does the key 45 unlocks my lock: ${lock.unlock(45)}")
    println("Does the key 70 unlocks my lock: ${lock.unlock(70)}")
    println("Does the key 89 unlocks my lock: ${lock.unlock(89)}")
    println("Does the key 136 unlocks my lock: ${lock.unlock(136)}")
}

class EncryptionLock(private val privateKey: Int) {

    fun unlock(publicKey: Int): Boolean = formula(publicKey) == privateKey

    private fun formula(publicKey: Int) = publicKey / 2 + 5
}