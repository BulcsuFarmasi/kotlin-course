package s24packages.exercise.client

import s24packages.exercise.hello.sayHi

fun getName() {
    println("Please enter your name")
    val name = readlnOrNull() ?: ""
    sayHi(name)
}