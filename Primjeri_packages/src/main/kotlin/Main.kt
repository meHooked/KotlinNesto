import com.algebra.rea.modul1.*
import com.algebra.renato.modul1.java.Test
import com.algebra.renato.modul2.sayHello

fun main(args: Array<String>) {
    for(i in 1..5) {
        sayHello()
    }
    sayHelloRea()
    sayGoodbyeRea()
    Test.sayHelloJava()
    //Zadatak 1: Napravite program koji ce za uneseni broj, ispisati godisnje doba koje je definirano na sljedeci nacin:

    // 1 -> Winter
    // 2 -> Spring
    // 3 -> Summer
    // 4 -> Autumn
    zadatak1Map()
    zadatak1When()

    //Zadatak 2: Napravite program koji ce za uneseni cijeli broj provjeriti je li prost
    //Prost broj je onaj koji je djeljiv samo sa 1 i sa samim sobom
    // 2,3,5,7, ...
    zadatak2()

}