fun main(args: Array<String>) {
    //Zadatak 1 - napravite cjelobrojnu varijablu i ispisite ju - potvrdite da je vrijednost cjelobrojna ispisom njene klase
    val number = 42
    println("Class ${number::class.java}")

    //Zadatak 2 - napravite long varijablu i ispisite ju - potvrdite da je vrijednost cjelobrojna ispisom njene klase
    val num1: Long = 42
    println("Class ${num1::class.java}")

    //Zadatak 3 - napravite long varijablu bez eksplicitnog definiranja tipa - potvrdite da je long ispisom njene klase
    val num2 = 42.toLong()
    val num3 = 42L
    println("Class ${num2::class.java}")
    println("Class ${num3::class.java}")

    //Zadatak 4 - definirajte dvije cjelobrojne varijable i provedite osnovne aritmeticke operacije nad njima, ispisite rezultate
    // + - * / %
    val num4 = 5
    val num5 = 2
    println(num4 + num5)
    println(num4 - num5)
    println(num4 * num5)
    println(num4 / num5)
    println(num4 % num5)

    println("-----------------------------")
    //Zadatak 5 - definirajte jednu cjelobrojnu varijablu i jednu realnu te provedite osnovne aritmeticke operacije nad njima
    val num6 = 5.0
    val num7 = 2
    println(num6 + num7)
    println(num6 - num7)
    println(num6 * num7)
    println(num6 / num7)
    println((num6 / num7)::class.java)





    //inkrement, dekrement, operatori usporedivanja
    println(5 > 2)
    println(5 < 2)
    println(5 == 5)
    println(5 <= 4)
    println(5 >= 4)
    println(5 != 4)

    var a = 5
    var b = ++a
    println("b = $b")
    println("a = $a")
    println("------------------------")

    b = b + 1
    println(b)
    b += 1
    println(b)

//    b = b - 1 //isto sto i b -= 1
//    b = b * 2 //isto sto i b *= 2
//    b = b / 2 //isto sto i b /= 2
//    b = b % 2 //isto sto i b %= 2




}