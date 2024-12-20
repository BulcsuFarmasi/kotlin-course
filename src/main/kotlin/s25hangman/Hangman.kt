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

    for (i in word.indices) {
        guesses.add('_')
    }

    var gameOver = false

    do {
        printGameStatus()
        println("Please enter a letter")
        val input = readlnOrNull() ?: ""

        if (input.isEmpty()) {
            println("That's not a valid input. Please try again")
        } else {
            val letter = input[0].uppercase()[0]
            if (word.contains(letter)) {
                for (i in word.indices) {
                    if (word[i] == letter) {
                        guesses[i] = letter
                    }
                }
                if (!guesses.contains('_')) {
                    gameOver = true
                }
            } else {
                println("Sorry, that's not part of the word")
                remainingGuesses--
                mistakes++
                if (mistakes == 6) {
                    gameOver = true
                }
            }
        }

    } while (!gameOver)

    if (mistakes == 6) {
        printGameStatus()
        println("Sorry, you lost. The word was \n $word")
    } else {
        println("\n Congratulation, you win!")
        print("The word was\n$word")
    }
}

fun printGameStatus() {
    when (mistakes) {
        0 -> printZeroMistakes()
        1 -> print1Mistake()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        6 -> print6Mistakes()
    }

    print("Word: ")
    for (element in guesses)
        print("$element ")
    println("\n You have $remainingGuesses guesses left")
}

fun printZeroMistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print1Mistake() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print2Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |      | ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print3Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /| ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print4Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print5Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     /  ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print6Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     / \\")
    println(" /|\\      ")
    println("/ | \\     ")
}