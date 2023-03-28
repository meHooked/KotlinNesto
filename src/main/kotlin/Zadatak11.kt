//Zadatak 11:
/*
Napravite funkciju aps() koja će za predani realan broj ispisati njegovu apsolutnu vrijednost.
|-5| = 5, |5| = 5 - a nula?
 */

fun main(args: Array<String>){
    aps()
}

fun aps() {
    println("Unesi broj:")
    var uneseniBroj = readln().toInt()

    if (uneseniBroj < 0){
        val apsolutniBroj = uneseniBroj * -1
        println("|$uneseniBroj| = $apsolutniBroj")
    } else {
        println("|$uneseniBroj| = $uneseniBroj")
    }
}



