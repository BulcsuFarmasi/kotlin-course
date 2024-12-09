package s25hangman

import kotlin.random.Random

val words = listOf("elbow", "writer", "circle", "polish", "bridge", "store", "fang", "scarecrow", "show", "jeans")
var word = ""
val guesses = arrayListOf<Char>()
var remainingGuesses = 6
var mistakes = 0

fun main(args: Array<String>) {
    setUpGame()
}

fun setUpGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].uppercase()
    println(word)
}