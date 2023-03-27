//Zadatak 11:
/*
Napravite funkciju aps() koja će za predani realan broj ispisati njegovu apsolutnu vrijednost.
|-5| = 5, |5| = 5
 */
fun main(){
    zadatak11()
}

fun zadatak11() {
    var myDouble = -4.0
    println(aps(myDouble))
}

fun aps(myDouble: Double): Double = if(myDouble >= 0) myDouble else -myDouble
