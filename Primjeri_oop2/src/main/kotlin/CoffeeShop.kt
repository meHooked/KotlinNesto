import kotlin.random.Random

class CoffeeShop {

    fun generateCoffee() : Coffee {
        val randomNumber = Random.nextInt(100)
        return if(randomNumber % 2 == 0){
            IrishMacchiato()
        } else {
            DoubleEspresso()
        }
    }
}