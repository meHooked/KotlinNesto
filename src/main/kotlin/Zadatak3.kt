//Zadatak 3:
/*
Napišite program koji će tražiti unos 3 realna broja i ispisati ih po veličini od najvećeg do najmanjeg.
 */
fun main(){
    val a = -5.0
    val b = 13.0
    val c = 0.32
    zadatak3(a, b, c)
}

fun zadatak3(a: Double, b: Double, c:Double){
    val maxNum = zadatak2(a, b, c)
    val minNum = zadatak3MinNum(a, b, c)
    val midNum = zadatak3MidNum(a, b, c, maxNum, minNum)
    println("Max value is: $maxNum, mid value is: $midNum, min value is $minNum")
}

fun zadatak3MinNum(a: Double, b: Double, c: Double) : Double{
    return if (a <= b && a <= c){
        a
    } else if (b <= a && b <= c){
        b
    } else {
        c
    }
}

fun zadatak3MidNum(a: Double, b: Double, c: Double, maxNum: Double, minNum: Double) : Double{
    return a + b + c - maxNum - minNum
}