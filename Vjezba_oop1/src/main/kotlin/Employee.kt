class Employee(val firstName: String, fullTime: Boolean) {
    var fullTime = fullTime
        get() {
            println("Running the custom getter")
            return field
        }
        set(value) {
            println("Running the custom setter")
            if(value){
                println("Are you sure it's true?")
                val input = readLine() ?: ""
                field = input[0] == 'Y'
            }
        }
}