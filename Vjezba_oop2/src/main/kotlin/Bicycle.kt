open class Bicycle(var color: String) {
    open fun ride() = println("Bike with color $color is riding")
    open fun stop() = println("Bike with color $color stopped")
    open fun repair() = println("Bike with color $color is repairing")
}