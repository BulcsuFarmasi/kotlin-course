fun main (){
    val acceptedColors = hashSetOf("white", "black", "grey")

    val myColors = hashSetOf("blue", "red", "black", "green")

    val matchingColors = myColors.intersect(acceptedColors)

    println("I can wear the following colors at work: $matchingColors")


    acceptedColors.add("red")

    val newMatchingColors = myColors.intersect(acceptedColors)

    println("Now I can wear the following: $newMatchingColors")
}