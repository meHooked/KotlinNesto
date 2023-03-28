//Zadatak 8:
/*
Napravite program koji će korisniku omogućiti učitavanje brojeva sve dok se ne unese -1.
Program treba ispisati na zaslon koliko je medu unesenim brojevima onih koji su djeljivi s 5.
 */
fun main(){
    zadatak8()
}

fun zadatak8() {
    rjesenje1()
    rjesenje2()
}

fun rjesenje2() {
    var counter = 0
    do {
        val input = readLine()?.toInt() ?: 1
        if(input % 5 == 0){
            counter++
        }

    } while(input != -1)
    println(counter)
}

fun rjesenje1() {
    val listOfNumbers = arrayListOf<Int>()
    do {
        val input = readLine()?.toInt() ?: 1
        listOfNumbers.add(input)

    } while(input != -1)

    println(listOfNumbers.filter { it % 5 == 0 }.size)
    //moglo se i
    println(listOfNumbers.map { if(it % 5 == 0) 1 else 0 }.sum())
    //ili
    var counter = 0
    for (i in listOfNumbers){
        if (i % 5 == 0)
            counter++
    }
    println(counter)
}
