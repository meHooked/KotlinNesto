//Zadatak 10:
/*
Napišite program koji će za uneseni prirodan broj n provjeriti je li on "potpuno neparan".
(Napomena: Broj je "potpuno neparan" ako mu je svaka znamenka neparna)
 */

fun main(){
    zadatak10()
}

fun zadatak10() {
    println("Unesi broj:")
    var broj = readln().toInt()
    var ostatak = broj % 10
    val rez = (broj - ostatak)/10


    if(broj % 2 != 0 && rez % 2 != 0){
        println("Broj $broj je potpuno neparan")
    } else if(broj %2!=0){
        println("Broj $broj nije potpuno neparan")
    } else {
        println("Broj $broj je paran")
    }
}
