abstract class Person(val firstName: String, val lastName: String, oib: String){

    var oib = oib
        set(value) {
            println("Checking OIB...")
            field = validateOib(value)
        }

    init {
        println("init person")
        this.oib = validateOib(oib);
    }

    private fun validateOib(oib: String): String {
        return if(oib.length == 11){
            println("Valid OIB")
            oib
        } else {
            println("invalid OIB")
            ""
        }
    }

    abstract fun work()
}