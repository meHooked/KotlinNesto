class Laptop(val operatingSystem: String) {
    companion object{
        var laptopCounter = 0
    }
    init {
        println("Starting a laptop with $operatingSystem")
        laptopCounter++
    }
}