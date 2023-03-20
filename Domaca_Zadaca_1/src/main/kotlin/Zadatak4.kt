import kotlin.math.sqrt

//Zadatak 4:
/*
Napravite program koji će za zadane cjelobrojne stranice pravokutnika izračunati opseg,
površinu ili duljinu dijagonale tog pravokutnika,
ovisno o izboru korisnika (unesite 1 za opseg, 2 za površinu, 3 za dijagonalu)
 (Napomena: koristiti when).
*/
fun main(){
    val a = 3
    val b = 2
    println(zadatak4(a, b))
}

fun zadatak4(a: Int, b:Int) : Double{
    println("Unesite 1 za opseg, 2 za povrsinu, 3 za dijagonalu")
    val input = readLine() ?: ""
    return when(input.toInt()){ //pretpostavimo da se input moze konvertirati u int
        1 -> zadatak4Opseg(a, b)
        2 -> zadatak4Povrsina(a, b)
        3 -> zadatak4Dijagonala(a,b)
        else -> 0.0
    }
}

fun zadatak4Dijagonala(a: Int, b: Int) = sqrt(a * a + b * b * 1.0)

fun zadatak4Povrsina(a: Int, b: Int): Double = a * b * 1.0

fun zadatak4Opseg(a: Int, b: Int) = 2 * a + 2 * b.toDouble()
