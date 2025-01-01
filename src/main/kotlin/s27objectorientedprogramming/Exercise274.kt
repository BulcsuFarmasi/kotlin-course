package s27objectorientedprogramming

fun main() {
    val engineer = Engineer()
    val doctor = Doctor()

    engineer.name = "Engineer"
    doctor.name = "Doctor"

    engineer.salary = 9000
    doctor.salary = 8500

    engineer.work()

    doctor.study()
    doctor.study()
    doctor.work()
    doctor.work()

    engineer.study()
    engineer.work()
    engineer.study()
    engineer.study()
    engineer.work()

    doctor.work()
    doctor.study()
    doctor.study()
    doctor.work()
}

open class Job {
    var name = "Generic Job"
    var revenue = 8000
    var salary = 3000

    fun work() {
        revenue += salary
        println("$name worked, increased the revenue to $revenue with a salary of $salary")
    }

    fun study() {
        salary += 100
        println("$name studied, increasing the salary to $salary")
    }
}

class Engineer : Job()

class Doctor : Job()