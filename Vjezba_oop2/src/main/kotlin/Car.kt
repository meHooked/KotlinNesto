class Car(val name: String) : Switchable  {
    override fun turnOn() {
        println("Car $name is turning on")
    }

    override fun turnOff() {
        println("Car $name is turning off")
    }
}