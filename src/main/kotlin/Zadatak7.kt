//Zadatak 7:
/*
Napravite program koji će omogućiti unošenje brojeva sve dok se ne unese broj koji je djeljiv s 3.
Program treba ispisati koliko je ukupno uneseno brojeva (uključujući i posljednji unesen broj) i njihov zbroj.

Testni primjeri:
2 7 13 17 21 -> Uneseno ih je 5, zbroj je 60
4 22 41 32 16 18 -> Uneseno ih je 6, zbroj je 133
 */
fun main() {
    zadatak7()
}

fun zadatak7() {
    var count = 0
    var sum = 0

    do {
        println("Enter number:")
        var input = readln().toInt()
        count += 1
        sum += input

    } while (input % 3 != 0)

    println("the count of numbers is $count, the sum of numbers is $sum")
}