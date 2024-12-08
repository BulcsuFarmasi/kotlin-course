fun main() {
    val attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))

    attendance["26 Sept"] = 4824

    println("The combined attendance of 25 and 26 Sept is ${(attendance["25 Sept"]?:0) + (attendance["26 Sept"]?:0)}")

    println("Is there attendance data for 22 Sept: ${attendance.containsKey("22 Sept")}")
}