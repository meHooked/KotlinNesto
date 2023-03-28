//Zadatak 15:
/*
Napravite funkciju isPalindrome() koja će za predani string vratiti true ukoliko je string palindrom i false ukoliko nije.
(Napomena: rijec je palindrom ukoliko se jednako cita s pocetka i s kraja, "ana" je palindrom , "ananas" nije)
 */
fun main(args:Array<String>){
    isPalindrome()
}

fun isPalindrome() {
    println("Unesi znakove:")
    var znakovi  = readlnOrNull().toString()
    var obrnutiZnakovi = znakovi.reversed()

    if (znakovi == obrnutiZnakovi){
        println("TRUE")//$znakovi je palindrom!")
    } else {
        println("FALSE")//$znakovi nije palindrom!")
    }

}
