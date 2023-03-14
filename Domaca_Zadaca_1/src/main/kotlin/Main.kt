fun main(args: Array<String>) {
    //Zadatak 1:
    /*
    Napravite program koji će unesenim realnim brojevima a i b zamijeniti mjesta te ih ispisati prije i poslije zamjene.
     */

    //Zadatak 2:
    /*
    Napišite program koji će tražiti unos 3 realna broja i ispisati vrijednost najveceg od njih.
     */

    //Zadatak 3:
    /*
    Napišite program koji će tražiti unos 3 realna broja i ispisati ih po veličini od najvećeg do najmanjeg.
     */

    //Zadatak 4:
    /*
    Napravite program koji će za zadane cjelobrojne stranice pravokutnika izračunati opseg,
    površinu ili duljinu dijagonale tog pravokutnika,
    ovisno o izboru korisnika (unesite 1 za opseg, 2 za površinu, 3 za dijagonalu)
     (Napomena: koristiti when).
    */

    //Zadatak 5:
    /*
    Napravite program koji će tražiti unošenje prirodnog broja n<10. Program treba izračunati n! (faktorijel)
    Faktorijel se racuna kao 1 * 2 * 3 ... * n
    PO definiciji 0! = 1 i 1! = 1
     */
    val n = 5
    println(factorial(10))
    println(factorial2(10))
    println(factorial3(10))
    println(factorial4(10))

    //Zadatak 6:
    /*
    Napravite program koji će,koristeći se petljom for, izračunati i ispisati rezultat zbroja:
     s=1^1+2^2+3^3+...+n^n (n < 10)
     */
    println(sumRecursion(4)) // 256 + 27 + 4 + 1 = 256 + 32 = 288 OK
    println(sumRecursion2(4))

    //Zadatak 7:
    /*
    Napravite program koji će omogućiti unošenje brojeva sve dok se ne unese broj koji je djeljiv s 3.
    Program treba ispisati koliko je ukupno uneseno brojeva (uključujući i posljednji unesen broj) i njihov zbroj.

    Testni primjeri:
    2 7 13 17 21 -> Uneseno ih je 5, zbroj je 60
    4 22 41 32 16 18 -> Uneseno ih je 6, zbroj je 133
     */

    //Zadatak 8:
    /*
    Napravite program koji će korisniku omogućiti učitavanje brojeva sve dok se ne unese -1.
    Program treba ispisati na zaslon koliko je medu unesenim brojevima onih koji su djeljivi s 5.
     */

    //Zadatak 9:
    /*
    Napravite program koji omogućuje unošenje cijelih brojeva sve dok se ne unese 0.
    Program treba ispisati koliko od unesenih brojeva ima barem jednu parnu znamenku.
    (Testni primjer: 3 17 21 87 16 24 18 37 0 , Rjesenje: 5)
     */

    //Zadatak 10:
    /*
    Napišite program koji će za uneseni prirodan broj n provjeriti je li on "potpuno neparan".
    (Napomena: Broj je "potpuno neparan" ako mu je svaka znamenka neparna)
     */

    //Zadatak 11:
    /*
    Napravite funkciju aps() koja će za predani realan broj ispisati njegovu apsolutnu vrijednost.
    |-5| = 5, |5| = 5
     */

    //Zadatak 12:
    /*
    Napravite funkciju promijeni() koja traži unos kuna te upisivanje tečaja
    1 eura u odnosu na 1 kn (npr za uneseni broj 7.5354 korisnik kaže da je 1 euro=7.5354 kn).
    Funkcija treba vratiti broj eura koje će korisnik dobiti za dane kune.
     */

    //Zadatak 13:
    /*
    Napravite funkciju obrni() koja će predani prirodan broj ispisati obrnutim poretkom znamenki.
    (Testni primjer: 1234 Rezultat: 4321)
     */

    //Zadatak 14:
    /*
    Napravite funkciju koja će primati niz znakova(string) te posebno još jedan znak(char)
     te ispišite koliko puta se taj znak pojavljuje u tome stringu.
     */

    //Zadatak 15:
    /*
    Napravite funkciju isPalindrome() koja će za predani string vratiti true ukoliko je string palindrom i false ukoliko nije.
(Napomena: rijec je palindrom ukoliko se jednako cita s pocetka i s kraja, "ana" je palindrom , "ananas" nije)
     */


}

fun factorial(n: Int): Int {
    var product = 1
    for(i in 1..n){
        product = product * i //ili product *= 1
    }
    return product
}

fun factorial2(n: Int): Int {
    var product = 1
    var i = n
    while(i > 1){
        product *= i
        i--
    }
    return product
}

//Faktorijel se definira kao
/*
f(x) = 1 , za x = 0 ili 1
f(x) = x * f(x-1), za x > 1
 */
fun factorial3(n : Int): Int {
    return when(n){
        0,1 -> 1
        else -> n * factorial3(n - 1)
    }
}

fun factorial4(n: Int): Int{
    return Array(n){it + 1}.reduce{acc, i -> acc * i}
}

fun sumRecursion(n: Int): Int {
    return when(n){
        0 -> 0
        1 -> 1
        else -> Math.pow(n * 1.0, n * 1.0).toInt() + sumRecursion(n - 1)
    }
}

fun sumRecursion2(n: Int): Int {
    return Array(n){it + 1}.reduce{acc, i -> acc + Math.pow(i * 1.0, i * 1.0).toInt()}
}
