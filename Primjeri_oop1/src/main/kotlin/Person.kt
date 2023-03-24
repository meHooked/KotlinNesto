class Person(var firstName: String = "Ivo", var lastName: String = "Ivic") {
    var fullName: String
    init {
        fullName = "$firstName + $lastName"
    }
    fun updateFullName(){
        fullName = "$firstName + $lastName"
    }
}