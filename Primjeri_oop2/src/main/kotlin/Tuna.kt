class Tuna : Fish(){
    override var fishName = "Tuna"
    override var speed = 5

    override fun swim() {
        super.swim()
        println("FishName is $fishName and it swims up to $speed")
    }
}