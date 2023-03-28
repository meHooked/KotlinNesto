//Zadatak 9:
/*
Napravite program koji omogućuje unošenje cijelih brojeva sve dok se ne unese 0.
Program treba ispisati koliko od unesenih brojeva ima barem jednu parnu znamenku.
(Testni primjer: 3 17 21 87 16 24 18 37 0 , Rjesenje: 5)
 */
fun main(){
    zadatak9()
}

fun zadatak9(){
    val listOfNumbers = arrayListOf<Int>()
    do {
        val input = readLine()?.toInt() ?: 1
        listOfNumbers.add(input)

    } while(input != 0)
    //1.nacin
    println(listOfNumbers.map { if(hasEvenDigit(it)) 1 else 0 }.sum())
    //drugi nacin
    var counter = 0
    for(element in listOfNumbers){
        if(hasEvenDigit(element)){
            counter++
        }
    }
    println(counter)

}
fun hasEvenDigit(num: Int): Boolean{
    var myNumber = num
    while(myNumber > 0){
        val lastDigit = myNumber % 10
        if(lastDigit % 2 == 0){
            return true
        }
        myNumber /= 10
    }
    return false
}