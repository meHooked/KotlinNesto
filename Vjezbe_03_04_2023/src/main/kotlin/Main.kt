fun main(args: Array<String>) {
    //Napravite funkciju printNumbersFrom0To100() koja ispisuje brojeve od 0 do 100
    printNumbersFrom0To100()
    //Napravite funkciju getFullName koja prima 2 stringa, ime i prezime, te ispisuje puno ime i prezime
    val fullName = getFullName("Pero", "Peric")
    println("FullName is $fullName")
    //Napravite funkcije addTwoNumbers koje za parametre primaju 2 cijela broja te 2 realna broja i vracaju njihov zbroj
    println(addTwoNumbers(5, 6))
    println(addTwoNumbers(5.3, 6.7))
    //napravite funkciju multiply koja prima 2 cjelobrojna faktora te label tipa string koji ce ispisati poruku
    //prije samog rezultata mnozenja. Defaultna poruka (label) je "The answer is: "
    println(multiply(5, 5))
    println(multiply(5, 5, "Result: "))
    println(multiply(operand2 = 5, operand1 = 9))
    println(multiply(label = "Result: ", operand2 = 3, operand1 = 4))
    //Napravite klasu Employee koja ima primarni konstruktor koji prima ime tipa String
    //u klasi definirajte funkciju upperCaseFirstName koja pretvara ime u uppercase
    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())
    //Napravite data klasu Car koja ima primarni konstruktor koji prima:
    //boju auta tipa String
    //model auta tipa String
    //godiste auta tipa Int
    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("grey", "Ford", 2017)
    //Napravite funkciju printColors koja prima proizvoljan broj auta te ispisuje njihove boje
    println("1 car:")
    printColors(car1)
    println("2 cars:")
    printColors(car1, car2)
    println("3 cars:")
    printColors(car1, car2, car3)
    //DZ:
    //Napravite funkciju appendStrings() koja konkatenira proizvoljan broj stringova u jedan veliki string
    //val appendedStrings = appendStrings("a", "b", "c", "d")
    //println(appendedStrings) // "abcd"


}

fun printColors(vararg cars: Car) {
    cars.forEach { it.color }
}

fun multiply(operand1: Int, operand2: Int, label: String = "The answer is: "): String {
    return "$label ${operand1 * operand2}"
}

fun addTwoNumbers(num1: Int, num2: Int): Int = num1 + num2

fun addTwoNumbers(num1: Double, num2: Double) : Double = num1 + num2

fun getFullName(firstName: String, lastName: String): String = "$firstName $lastName"

fun printNumbersFrom0To100() {
    for (i in 0..100){
        print("$i ")
    }
    println()
}
