import java.lang.StringBuilder
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    //Zadatak 1: Ispisite svoje ime na konzolu - rezultat : My name is <MY_NAME>
    println("My name is Renato")

    //Zadatak 2: Ispisite svoje ime na konzolu, ali neka ono bude u dvostrukim navodnicima  My name is "Renato"
    println("My name is \"Renato\"")

    //Zadatak 3: Ispisite string "Two types of slashes: \ and /" na konzolu
    println("Two types of slashes: \\ and /")

    //Zadatak 4: DZ - ispisite zeca na konzolu, spremite svaki red u zasebnu varijablu
    /*
        (\(\
        (-.-)
        o_(")(")
     */

    //String
    val myName = "renato"
    println("My name is ${myName.capitalize()}")
    println("Length of my name is: ${myName.length}")

    var myText = "   lot of spaces   "
    println("myText: $myText")
    println("myText: length before trimming: ${myText.length}")

    myText = myText.trim()
    println("myText: $myText")
    println("myText: length before trimming: ${myText.length}")

    val myPet = "Cat"
    println(myPet[0])
    println(myPet.substring(1))
    println(myPet.substring(0,2))
    println("-------------------------------------")

    //Zadatak 5: Definirajte broj jabuka i banana u trgovini te ispisite "The total number of fruit is X" gdje je X zbroj kolicine jabuka i banana u istoj
    val numOfApples: Byte = 300.toByte()
    println("numOfApples: $numOfApples")
    val numOfBananas = 10

    println("The total number of fruit is ${numOfApples + numOfBananas}")
    println(numOfApples::class.java)

//    var myText2: StringBuilder = StringBuilder("My Text 2")
//    myText2[3] = 'D'
//    println(myText2)

    val num1: Short = 20
    val num2 = 2
    println(num1 + num2)
    println(num1 - num2)
    val result = (num1 * num2).toString()



    var myBoolean1 = true // Danas pada kisa
    var myBoolean2 = false // Danas ne pada kisa
    //myBoolean1 = !myBoolean1
    println(myBoolean1 || myBoolean2)
    println(myBoolean1 && myBoolean2)
    println(!myBoolean1 && (myBoolean1 || !myBoolean2)) // () > ! > && > ||


}
