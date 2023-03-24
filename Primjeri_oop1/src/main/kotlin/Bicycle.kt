class Bicycle {
    var model: String
        get() {
            println("Getting model...")
            return field
        }
        set(value) {
            println("Setting model...")
            field = value
        }
    var topSpeed: Int
        get() {
            println("Getting top speed...")
            return field
        }
        set(value) {
            println("Setting top speed...")
            field = value
        }

    constructor(){
        model = "No model"
        topSpeed = 35
    }
    constructor(newModel: String){
        model = newModel
        topSpeed = 35
    }

    constructor(model: String, topSpeed: Int){
        this.model = model
        this.topSpeed = topSpeed
    }
}