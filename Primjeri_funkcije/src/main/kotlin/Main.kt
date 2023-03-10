fun main(args: Array<String>) {
    //Funkcije

    println()
    println("Parametar")

    val result = addNumbers(1, 2)
    println(result)
    sayHello()

    val squareResult = numberSquared(3.14)
    println(squareResult)
    println(numberSquared(3.14))

    //
    println(addNumbers(5, numberSquared(3.14).toInt()))
    println(addNumbers(4))
    println(addNumbers(4.5))
    //
    println("--------------------------")
    foo("a", "b")
    println("--------------------------")
    foo("c", "d", "e")
    println("--------------------------")
    foo("a1")
    println("--------------------------")
    foo(strings = arrayOf("a", "b", "c", "d", "e"))
    println("--------------------------")
    foo("a")

    //
    firstAndSecond()
    firstAndSecond(2 , 3)
    firstAndSecond(first = 2, second = 3)
    firstAndSecond(second = 3, first = 2)

    firstAndSecondAndThird(second = 3, third = 7 , first = 8)
    firstAndSecondAndThirdAndFourth(1, 3, fourth = 7, third = 3)


}

fun addNumbers(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun addNumbers(num1: Int): Int{
    return num1 + 2
}

fun addNumbers(num1: Double): Double{
    return num1 + 2.0
}

fun sayHello() {
    val greeting = "Hello"
    println(greeting)
    greeting.sayHello()
}

fun numberSquared(num: Double) :Double {
    return num * num
}

fun String.sayHello(){
    println("sayHello")
}

fun foo(vararg strings:String = arrayOf("a")){
    for(a in strings){
        println(a)
    }
}

fun firstAndSecond(first: Int = 1, second: Int = 2){
    println("First: $first, Second: $second")
}

fun firstAndSecondAndThird(first: Int = 1, second: Int = 2, third:Int = 3){
    println("First: $first, Second: $second, Third: $third")
}

fun firstAndSecondAndThirdAndFourth(first: Int = 1, second: Int = 2, third:Int = 3, fourth:Int = 4){
    println("First: $first, Second: $second, Third: $third, Fourth: $fourth")
}