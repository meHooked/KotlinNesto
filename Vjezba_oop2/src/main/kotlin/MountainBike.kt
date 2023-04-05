class MountainBike(color: String, val numOfGears: Int, val maxSpeed: Double) : Bicycle(color) {
    fun adjustToRegularRoad() = println("Adjusted to regular road")

    override fun ride() = println("Mountain bike with color $color is riding")

    override fun repair() = println("Mountain bike with color $color is repairing")
}