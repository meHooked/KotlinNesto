//Zadatak 8:
/*
Napravite program koji će korisniku omogućiti učitavanje brojeva sve dok se ne unese -1.
Program treba ispisati na zaslon koliko je medu unesenim brojevima onih koji su djeljivi s 5.
 */
fun main(){
    zadatak8()
}

fun zadatak8() {
    var count = 0


    do {
        println("Unesi broj:")
        var input = readln().toInt()

        if (input % 5 == 0 && input != 0){
            count += 1
        }

    } while (input != -1)

    println("Među unesenima ima $count brojeva djeljivih s 5")
}
