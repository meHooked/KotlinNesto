import java.util.regex.Matcher
import java.util.regex.Pattern
import java.util.stream.IntStream

//Zadatak 14:
/*
Napravite funkciju koja će primati niz znakova(string) te posebno još jedan znak(char)
 te ispišite koliko puta se taj znak pojavljuje u tome stringu.
 */

fun main (args:Array<String>){

    zadatak14()
}

fun zadatak14() {

    println("Unesi niz znakova: ")
    var nizZnakova: String = readlnOrNull().toString()
    println("Unesi jedan znak: ")

    var znak: Char = '\u0000'
    try {
        znak = readlnOrNull()?.get(0) ?: '\u0000'
    } catch (e:Exception){
        println("Nema unosa!")
    }
    var broji: Int = 0

    for (z in nizZnakova) {
        if (z == znak) {
            broji += 1
        }
    }
    println("Znak se u nizu pojavljuje $broji puta!")
}