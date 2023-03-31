class CityBike(color: String, val tireRadius: Double) : Bicycle(color) {

    var canRideOnDirt: Boolean = false

    constructor(color: String, tireRadius: Double, canRideOnDirt: Boolean) : this(color, tireRadius){
        this.canRideOnDirt = canRideOnDirt;
    }

    override fun ride() = println("City Bike with color $color is riding")
}