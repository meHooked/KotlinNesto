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

    //VJEZBA
    //Zadatak1
    //Dan je skup cijelih brojeva, ispisite samo one koji su dvoznamenkasti
    println("-------------------------VJEZBA--------------------")
    val numbersSet = setOf(3, 456, 67, 4, 567, 34, 6575)
    // ......
    //Rjesenje 1
    for (i in numbersSet){
        if(i>=10 && i < 100) {
            println(i)
        }
    }
    println("-------------------------")
    //Rjesenje 2
    zad1(numbersSet)
    //Rjesenje 3
    println(numbersSet.filter { it in 10..99 })
    //Rjesenje 4
    numbersSet.filter { it in 10..99 }.forEach { print("$it ") }

    //Zadatak 2
    //Dana je lista klijenata iz neke online trgovine.
    //Prikazite listu koja je sortirana po imenu
    val clients = listOf("Renato", "Ivan", "Marijana", "Marko", "Bozica")
    println()
    //Rjesenje 1
    println(clients.sorted())
    //Rjesenje 2
    println(clients.sortedBy { it }) //ovdje mozemo dati nas kriterij za sortiranje
    //println(clients.sortedBy { client -> client })

    //Zadatak 3
    //Dana je lista troznamenkastih brojeva, ispisite broj koji ima najvecu srednju znamenku

    val threeDigitNumbers = listOf(372, 836, 191, 989, 444)
    //Luka : println(threeDigitNumbers.map{ it.toString() }.sortedByDescending { it[1] }[0])
    //opcenito - (x / 10) % 10 - vraca drugu znamenku broja
    //Rjesenje 1
    println(threeDigitNumbers.maxBy { it / 10 % 10 })
    val digitLambda = {x : Int -> x / 10 % 10}
    println(threeDigitNumbers.maxBy(::middleDigit))
    println(threeDigitNumbers.maxBy(digitLambda))
    //DZ rijesite klasicno funkcijom i for petljom u funkciji

    //Zadatak 4
    //Zadana je lista cijelih brojeva. Napravite novu listu na sljedeci nacin:
    // 1. Ako je broj u listi neparan, udvostrucite ga
    // 2. Ako je broj paran, prepolovite ga
    //3. Ispisite samo one elemente koji su nakon transformacije veci od 25

    val randomIntegers = arrayListOf(1, 5, 10, 20, 60, 80)
    println(randomIntegers)
    //Luka
    val newList = randomIntegers.map { if (it % 2 != 0){it * 2} else {it / 2} }.filter { it > 25 }
    println(newList)

    //Nikola
    val newRandomIntegers = randomIntegers.map { n ->
        if (n % 2 == 0) {
            n / 2
        } else {
            n * 2
        }
    }.filter { n ->
        n > 25
    }

    println(newRandomIntegers)

    //Ivan
    val transformedIntegers = randomIntegers.map {
        if (it % 2 == 0) it / 2 else it * 2
    }.filter {
        it > 25
    }

    println(transformedIntegers)
    println(randomIntegers)
    //BONUS - nakon transformacije - zbrojite elemente dobivene liste i ispisite rezultat na ekran
    //Rjesenje 1
    println(transformedIntegers.sum())
    //Rjesenje 2
    val listSum = randomIntegers.map { if (it % 2 != 0){it * 2} else {it / 2} }.filter { it > 25 }.reduce{acc, i -> acc + i}
    println(listSum)

    //Istraziti koji kod se najbrze izvrsava - vidi zadatak 1

    //Rjesenje zadatka za DZ
    println(maxByMiddleDigit(threeDigitNumbers))
}

fun middleDigit(n: Int) : Int {
    return n /10 % 10
}

fun zad1(numbersSet: Set<Int>) {
    for (i in numbersSet){
        if(i in 10..99) {
            println(i)
        }
    }
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

fun maxByMiddleDigit(lists: List <Int>): Int {
    var y = lists[0]
    for (l in lists) {
        if (getMiddleDigit(l) > getMiddleDigit(y)){
            y = l
        }
    }
    return y
}
fun getMiddleDigit(x : Int) : Int {
    return x / 10 % 10
}
