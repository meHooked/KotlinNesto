//Zadatak 6:
/*
Napravite program koji će,koristeći se petljom for, izračunati i ispisati rezultat zbroja:
 s=1^1+2^2+3^3+...+n^n (n < 10)
 */
fun main(){
    zadatak6()
}

fun zadatak6(){
    println(sumRecursion(4)) // 256 + 27 + 4 + 1 = 256 + 32 = 288 OK
    println(sumRecursion2(4))
}

fun sumRecursion(n: Int): Int {
    return when(n){
        0 -> 0
        1 -> 1
        else -> Math.pow(n * 1.0, n * 1.0).toInt() + sumRecursion(n - 1)
    }
}

fun sumRecursion2(n: Int): Int {
    return Array(n){it + 1}.reduce{acc, i -> acc + Math.pow(i * 1.0, i * 1.0).toInt()}
}