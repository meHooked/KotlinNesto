//Zadatak 9:
/*
Napravite program koji omogućuje unošenje cijelih brojeva sve dok se ne unese 0.
Program treba ispisati koliko od unesenih brojeva ima barem jednu parnu znamenku.
(Testni primjer: 3 17 21 87 16 24 18 37 0 , Rjesenje: 5)
 */

fun main(){
    zadatak9()
}

fun zadatak9() {
    var broji = 0

    do {
        println("Unesi broj:")
        var input = readln().toInt()
        var ostatak = input % 10
        val rez = (input - ostatak)/10

        if (input > 10 && input % 2 == 0){
            //println("Zadnja znamenka je parna i brojimo ")
            broji += 1

        } else if (input > 10 && input % 2 != 0 && rez % 2 == 0){
            //println("Zadnja znamenka je neparna, prva je parna, brojimo")
            broji += 1

        } else if(input != 0 && input < 10 && input % 2 == 0){
            broji += 1
        }

    } while (input != 0)

    println("Među unesenima ima $broji brojeva sa barem jednom parnom znamenkom")
}
