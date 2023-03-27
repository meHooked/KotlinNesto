//Zadatak 10:
/*
Napišite program koji će za uneseni prirodan broj n provjeriti je li on "potpuno neparan".
(Napomena: Broj je "potpuno neparan" ako mu je svaka znamenka neparna)
 */
fun main() {
    zadatak10()
}

fun zadatak10() {
    val number = 1111
    println(potpunoNeparan(number))
}

fun potpunoNeparan(number: Int): Boolean {
    var myNumber = number
    while (myNumber > 0) {
        val lastDigit = myNumber % 10
        if (lastDigit % 2 == 0) {
            return false
        }
        myNumber /= 10
    }
    return true
}
