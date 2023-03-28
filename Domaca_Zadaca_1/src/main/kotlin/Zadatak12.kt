//Zadatak 12:
/*
Napravite funkciju promijeni() koja traži unos kuna te upisivanje tečaja
1 eura u odnosu na 1 kn (npr za uneseni broj 7.5354 korisnik kaže da je 1 euro=7.5354 kn).
Funkcija treba vratiti broj eura koje će korisnik dobiti za dane kune.
 */
fun main(){
    zadatak12()
}

fun zadatak12() {
    val myKunas = 100.0
    val myExchangeRate = 7.5354
    println(promijeni(myKunas, myExchangeRate))
}

fun promijeni(myKunas:Double, myExchangeRate: Double): Double = if(myExchangeRate != 0.0) myKunas / myExchangeRate else 0.0
