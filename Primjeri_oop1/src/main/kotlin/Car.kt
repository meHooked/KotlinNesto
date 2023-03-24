class Car {
    var model:String? = null
    var topSpeed = 200

    fun start(){
        println("Starting the $model")
    }

    fun drive(speed: Int){
        println("Driving at a speed of $speed")
    }
}