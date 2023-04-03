import java.math.BigDecimal

fun main(){
    //Napravite enum klasu Season koja moze poprimiti vrijednosti SPRING, SUMMER, FALL, WINTER
    var num = 100
    val timeOfYear = Season.WINTER//nesto iz vase enum klase
    //U ovisnosti o godisnjem dobu, promijenite vrijednost varijable num te spremiti u varijablu str pripadnu poruku:
    //Proljece -> num uvecati za 5 i spremiti "It's not that hot"
    //Ljeto -> spremiti "It's hot"
    //Jesen -> "It's getting cooler"
    //Zimu -> umanjiti num za 50 i spremiti "Brrrr"
    //nakon toga ispisati vrijednost str varijable
    val str = when(timeOfYear){
        Season.SPRING -> {
            num += 5 // ili num = num + 5
            "It's not that hot"
        }
        Season.SUMMER -> "It's hot"
        Season.FALL -> "It's getting cooler"
        else -> {
            num -= 50
            "Brrrr"
        }
    }
    println(str)
    val num2 = -50
    //Koristeci if-else if- else te when, usporedite num i num2 te ispisite koji je broj veci ili jesu li jednaki
    if(num < num2){
        println("num is less than num2")
    }
    else if(num > num2){
        println("num is greater than num2")
    }
    else {
        println("num = num2")
    }

    //
    when {
        num < num2 -> println("num is less than num2")
        num > num2 ->  println("num is greater than num2")
        else ->  println("num = num2")
    }
    //Provjerite zadovoljava li num iduce uvjete te ispisite pripadnu poruku:
    //Ako je num u rangeu od 100 do 199 - "in range 100..199"
    //Ako je num 200, ispisite "200"
    //Ako je num 300, ispisite "300
    //Inace ispisite "Doesn't match anything"
    when(num){
        in 100..199 -> println("in range 100..199")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }
    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45

    val something: Any = obj3
    if(something is String){
        println(something.uppercase())
    }
    else if(something is BigDecimal){
        println(something.remainder(BigDecimal(10.5)))
    }
    else if(something is Int){
        println("${something - 22}")
    }
    else {
        println("I have no idea what type this is")
    }

    val z = when(something){
        is String -> {
            println(something.uppercase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println("${something - 22}")
            3
        }
        else -> {
            println("I have no idea what type this is")
            4
        }
    }
    println(z)
}