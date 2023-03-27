import kotlin.random.Random

class AnimalFactory {

    fun getAnimal() : Animal{
        val randomNumber = Random.nextInt(100)
        return when (randomNumber % 3){
            0 -> Dog()
            1 -> Cat()
            else -> Parrot()
        }
    }
}