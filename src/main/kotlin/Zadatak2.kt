//Zadatak 2:
/*
Napišite program koji će tražiti unos 3 realna broja i ispisati vrijednost najveceg od njih.
 */
fun main(){
    val a = -5.0
    val b = 13.0
    val c = 0.32
    println(zadatak2(a, b, c))
}

fun zadatak2(a: Double, b: Double, c: Double) : Double{
    return if (a >= b && a >= c){
        a
    } else if (b >= a && b >= c){
        b
    } else {
        c
    }
}