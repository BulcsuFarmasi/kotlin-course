package s30interfaces

fun main() {
    var food = FastFoodRestaurant().buyFood()
    food.eat()

    food = FrenchRestaurant().todaysSpecial()
    food.eat()
}

interface Food {
    fun eat()
}

class FastFood : Food {
    override fun eat() {
        println("Fast Food will feed you")
    }
}

class FrenchFood : Food {
    override fun eat() {
        println("French food will feed you and delight you")
    }
}

class FastFoodRestaurant {
    fun buyFood(): Food {
        return FastFood()
    }
}

class FrenchRestaurant {
    fun todaysSpecial(): Food {
        return FrenchFood()
    }
}