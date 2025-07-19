package s30interfaces

fun main() {
    val carRental = CarRental()

    var car = carRental.getUtilityCar()
    car.drive()

    car = carRental.getLimousine()
    car.drive()
}

interface RentalCar {
    fun drive()
}

class UtilityCar : RentalCar {
    override fun drive() {
        println("Utility car drives you to the destination")
    }

}

class Limousine : RentalCar {
    override fun drive() {
        println("Limousine gets you to your destination in comfort")
    }

}

class CarRental {
    val priceForUtilityCar = 100
    val priceForLimousine = 500

    fun getUtilityCar(): RentalCar {
        return UtilityCar()
    }

    fun getLimousine(): RentalCar {
        return Limousine()
    }
}