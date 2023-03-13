const val PI_VALUE = 3.14
fun main(args: Array<String>) {
   val myArr = intArrayOf(1, 2, 3)
    println(sumNumbers(ints = myArr))
    println(sumNumbers(x = 2, ints = myArr))
    println(sumNumbers(3))
    println(sumNumbers())
    println(sumNumbers(1, 2, 3, 4))
    createUser("admin", "user", username = "Renato", age = 27)
    createUser(username = "Renato", age = 27, roles = arrayOf("admin", "user"))
    listAnimals()
    //Kreirajte funkciju koja za uneseni polumjer kruga (r) racuna njegovu povrsinu
    println(circleArea(1.0))

    //Lambdas
    //Anonymous function - no name
    val myLambda = {name: String -> println("Hello $name")}
    val names = arrayListOf("Ivan", "Luka", "Matej", "Valentina")
    println("-----------------------LAMBDA VERSION ------------------")
    sayHello(names, myLambda)
    println("----------------NORMAL FUNCTION-----------------------")
    sayHello(names, ::helloName)
    val numbers = arrayListOf(2, 4, 10, 19, 20, 100, 55, 99)
    println(numbers)
    val numbersLambda = {number: Int -> number / 10}
    val newNumbers = myUpdate(numbers, numbersLambda)
    println(newNumbers)
    println(numbers)
    numbers.forEach { print("${it / 10} ") }
    println()
    println(numbers)
    val newNames = names.filter { it.length > 4 }
    println(names)
    println(newNames)
    val resultMap = names.map { it.uppercase() }
    println(names)
    println(resultMap)
    val stringsConcatenated = names.reduce{ acc, s -> "$acc$s"} // "",
    println(stringsConcatenated)
    //Dobivamo zbroj svih znakova imena koja su duza od 4 znaka
    val totalChars = names.map { it.length }.filter { it > 4 }.reduce{ acc, i -> acc + i}
    println(totalChars)
}

fun myUpdate(numbers: ArrayList<Int>, numbersLambda: (Int) -> Int): ArrayList<Int> {
    for(i in 0 until numbers.size){
        if(numbers[i] % 2 == 0){
            numbers[i] = numbersLambda(numbers[i])
        }
    }
    return numbers
}

fun sayHello(names: ArrayList<String>, myLambda: (String) -> Unit) {
    for(name in names){
        myLambda(name)
    }
}

fun helloName(name: String){
    println("Hello $name")
}

fun circleArea(r: Double): Double = r * r * PI_VALUE

fun listAnimals() {
    fun listOneAnimal(animal: String){
        println("I have a $animal")
    }
    val animals = listOf("cat", "dog", "goldfish")
    for(animal in animals){
        listOneAnimal(animal)
    }
}

fun sumNumbers(x:Int = 0, vararg ints: Int): Int {
    var sum = x
    for(int in ints){
        sum += int
    }
    return sum
}

fun createUser(vararg roles: String, username: String, age: Int){
    for(role in roles){
        print("$role ")
    }
    print("$username $age\n")
}
