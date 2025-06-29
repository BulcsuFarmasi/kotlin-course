package s30interfaces

fun main() {
    var car = CarRental().getUtilityCar()
    car.drive()

    car = CarRental().getLimousine()
    car.drive()
}

interface Auto {
    fun drive()
}

class UtilityCar : Auto {
    override fun drive() {
        println("Utility car drives you to the destination")
    }

}

class Limousine : Auto {
    override fun drive() {
        println("Limousine gets you to your destination in comfort")
    }

}

class CarRental {
    val priceForUtilityCar = 100
    val priceForLimousine = 500

    fun getUtilityCar(): Auto {
        return UtilityCar()
    }

    fun getLimousine(): Auto {
        return Limousine()
    }
}