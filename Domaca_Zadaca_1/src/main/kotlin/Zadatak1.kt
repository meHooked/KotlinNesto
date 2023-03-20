//Zadatak 1:
/*
Napravite program koji će unesenim realnim brojevima a i b zamijeniti mjesta te ih ispisati prije i poslije zamjene.
 */
fun main(){
    zadatak1()
}
fun zadatak1(){
    println("Unesite prvi broj")
    var num1: Double? = readLine()?.toDouble()
    println("Unesite drugi broj")
    var num2: Double? = readLine()?.toDouble()
    println("Prvi broj je $num1, drugi broj je $num2")
    val temp = num1
    num1 = num2
    num2 = temp
    println("Nakon zamjene prvi broj je $num1, drugi broj je $num2")

    //Drugi nacin
    var num3 = num1
    var num4 = num2
    println("Drugi nacin, prije zamjene: ${num3}, ${num4}")
    num3 = num3!! + num4!!
    num4 = num3!! - num4!!
    num3 = num3!! - num4!!
    println("Drugi nacin, nakon zamjene: ${num3}, ${num4}")
}