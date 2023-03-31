class Doctor(firstName: String, lastName: String, oib: String, val specialization: String) : Person(firstName, lastName, oib){
    override fun work() {
        println("Operating")
    }

}