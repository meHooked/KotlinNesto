//Zadatak 13:
/*
Napravite funkciju obrni() koja će predani prirodan broj ispisati obrnutim poretkom znamenki.
(Testni primjer: 1234 Rezultat: 4321)
 */

fun main (args:Array<String>){
    obrni()
}

fun obrni() {
    println("Unesi broj:")
    var br = readln().toInt()
    var obrnuto = 0

    while (br != 0){
        var znamenka = br % 10
       // println(znamenka)
        //println("$obrnuto = $obrnuto * 10 + $znamenka")
        obrnuto = obrnuto * 10 + znamenka
        br /= 10
    }
    println("Obrnuti broj: $obrnuto")
}
