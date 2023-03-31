class Car(val color: String, val model: String, val year: Int, val numOfGears: Int) {

    var typeOfGas: String = "Default gas"
    companion object {
        private var cars = arrayListOf<Car>()
        fun avgYear() : Int{
            var total = 0
            for(car in cars){
                total += car.year
            }
            return total / cars.size
        }
    }
    init {
        cars.add(this)
    }

    constructor(color: String, model: String, year: Int, numOfGears: Int, typeOfGas: String) : this(color, model, year, numOfGears){
        this.typeOfGas = typeOfGas
    }
    fun drive(){
        println("$color $model is driving")
    }
    fun park(){
        println("$color $model is parking")
    }

}
