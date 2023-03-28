//Zadatak 13:
/*
Napravite funkciju obrni() koja će predani prirodan broj ispisati obrnutim poretkom znamenki.
(Testni primjer: 1234 Rezultat: 4321)
 */
fun main(){
    zadatak13()
}

fun zadatak13() {
    val number = 123412
    obrni(number)
    println(obrni2(number))
    obrni3(number)
}

fun obrni2(number: Int): Int {
    var br = number
    var obrnuto = 0

    while (br != 0){
        var znamenka = br % 10
        // println(znamenka)
        //println("$obrnuto = $obrnuto * 10 + $znamenka")
        obrnuto = obrnuto * 10 + znamenka
        br /= 10
    }
    return obrnuto
}

fun obrni(number: Int) {
    var myNumber = number
    while(myNumber > 0){
        val lastDigit = myNumber % 10
        print("$lastDigit")
        myNumber /= 10
    }
    println()
}

fun obrni3(number: Int){
    println(number.toString().reversed())
}
