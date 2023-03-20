//Zadatak 5:
/*
Napravite program koji će tražiti unošenje prirodnog broja n<10. Program treba izračunati n! (faktorijel)
Faktorijel se racuna kao 1 * 2 * 3 ... * n
PO definiciji 0! = 1 i 1! = 1
 */
fun main(){
    zadatak5()
}

fun zadatak5(){
    println(factorial(10))
    println(factorial2(10))
    println(factorial3(10))
    println(factorial4(10))
}

fun factorial(n: Int): Int {
    var product = 1
    for(i in 1..n){
        product = product * i //ili product *= 1
    }
    return product
}

fun factorial2(n: Int): Int {
    var product = 1
    var i = n
    while(i > 1){
        product *= i
        i--
    }
    return product
}

//Faktorijel se definira kao
/*
f(x) = 1 , za x = 0 ili 1
f(x) = x * f(x-1), za x > 1
 */
fun factorial3(n : Int): Int {
    return when(n){
        0,1 -> 1
        else -> n * factorial3(n - 1)
    }
}

fun factorial4(n: Int): Int{
    return Array(n){it + 1}.reduce{acc, i -> acc * i}
}