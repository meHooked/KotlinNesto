class Computer(val type: ComputerType, val processorName: String) : ComputerSwitchable {
    override fun enterBios() {
        println("Entering Bios")
    }

    override fun turnOn() {
       println("Computer turning on")
    }

    override fun turnOff() {
        println("Computer turning off")
    }

    override fun bootUp(speed: Double): Double {
        if(type == ComputerType.NEW){
            return ComputerType.getBootSpeed(type)
        }
        return super.bootUp(speed)
    }
}