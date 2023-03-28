fun main(args: Array<String>) {
    //Napravite data klasu Car koja prima 4 parametra:
    //boja - String
    // model - String
    // godiste - Int
    // broj brzina - Int
    //klasa takoder ima i sekundarni konstruktor koji dodatno prima:
    //vrstu goriva na koji automobil ide - String
    //klasa ima sljedece metode (funkcije)
    // fun drive() - ispisuje koja boja auta i koji model auta se vozi
    // fun park() - ispisuje koja boja auta i koji model auta se parkira
    //Testirajte navedene funkcionalnosti u mainu
    // Kreiranje primjera klase Car

    //Izracunajte prosjecno godiste svih kreiranih automobila
    val car = Car("red", "Audi", 2015, 5, "diesel")
    val car2 = Car("blue", "BMW", 2017, 6)
    val car3 = Car("blue", "BMW", 2009, 6)

    car.drive()
    car2.park()
    println(Car.avgYear())

    val car4 = JavaCar("red", "Audi", 2015)
    val car5 = JavaCar("blue", "BMW", 2017)
    val car6 = JavaCar("blue", "BMW", 2009)

    car4.drive()
    car5.park()
    car6.color = "aaa"
    println(JavaCar.getAverageYear())

    //napravite klasu Employee koja prima 2 parametra
    // firstName - String - ime
    // fullTime - Boolean (true/false) koja daje informaciju o tome je li zaposlenik zaposlen na puno radno vrijeme
    // napravite custom getter i setter za fullTime:
    // "Running the custom get"
    // "Running the custom set"
    val e1 = Employee("Renato", false)
    println(e1.fullTime)
    e1.fullTime = true
    println(e1.fullTime)
    println("------------JAVA EXAMPLE-----------------")

    val e2 = JavaEmployee("Renato", false)
    println(e2.fullTime)
    e2.fullTime = true
    println(e2.fullTime)

}