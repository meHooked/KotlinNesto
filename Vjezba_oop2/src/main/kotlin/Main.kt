fun main(args: Array<String>) {

    //Napravite klasu Bicycle koja ima primarni konstruktor koji prima boju tipa String te ima 3 metode:

    //ride() - ispisuje "bicycle with color X is riding"
    //stop() - ispisuje "bicycle with color X stopped"
    //repair() - ispisuje da se bicikl popravlja "bicycle with color X is repairing"

    //klasa Bicycle ce se nasljedivati te se navedene metode mogu redefinirati
    println("--------BICYCLE----------")
    val bicycle = Bicycle("Red")
    bicycle.ride()
    bicycle.stop()
    bicycle.repair()

    //Kreirajte klasu MountainBike koja nasljeduje Bicycle te dodatno implementira metodu adjustToRegularRoad()
    //koja ispisuje "Adjusted to regular road"
    //Parametri u konstruktoru su dodatno numOfGears koji je cijeli broj te maxSpeed koji je realan broj
    //Redefinirajte funkcije ride i repair da ispisuju da se vozi i popravlja Mountain Bike (umjesto obicnog Bicycle)
    println("--------MOUNTAIN BIKE------------")
    val mountainBike = MountainBike("Green", 28, 56.0)
    mountainBike.ride()
    mountainBike.stop()
    mountainBike.repair()
    mountainBike.adjustToRegularRoad()

    //Napravite clasu CityBike koja ima primarni konstruktor koji prima 2 parametra:
    //color tipa string
    //tireRadius tipa Double
    //klasa ima i sekundarni konstruktor koji dodatno prima canRideOnDirt, defaultne vrijednosti false
    //redefinirajte funkciju ride() koja ce ispisati "City bike with color X is riding"

    println("---------------CITY BIKE-------------------")
    val cityBike = CityBike(tireRadius = 26.8, canRideOnDirt = true, color = "White")
    cityBike.stop()
    cityBike.ride()

    println("-----------------------------------------------")

    //Definirajmo apstraktnu klasu Person koja ima primarni konstruktor koji prima:
    //firstName - String
    //lastName - String
    //OIB - String
    //Prilikom inicijalizacije objekta koji nasljeduje person zelimo napraviti validaciju OIB-a na sljedeci nacin:
    //ako je duljina oiba 11, spremi proslijedeni OIB, a ukoliko nije, u OIB polje treba staviti prazan string
    //isto tako, ukoliko modificiramo postojeci OIB, treba napraviti istu validaciju.
    //Funkcija za validaciju treba biti skrivena od samog korisnika (ne mozemo joj direktno pristupiti iz maina)
    //unutar klase Person treba postojati apstraktna funkcija work()

    //Napravimo klasu Doctor koji nasljeduje Person, u primarnom konstruktoru
    //dodatno prima specijalizaciju koja je tipa String te definira work() funkciju - ispisuje "Operating"
    val doctor = Doctor("Mario", "Maric", "12345678910", "Surgeon")
    doctor.oib = "123"
    doctor.work()
    //Napravite data klasu Exam koja ima primarni konstruktor koji prima:
    //ime ispita - String
    //ocjenu ispita - Int

    //Napravite klasu Student koja nasljeduje klasu Person, a dodatno u primarnom konstruktoru prima
    //facultyName : String

    //Treba voditi evidenciju svih polozenih ispita. Kreirajte nekoliko objekata tipa Student, polozite proizvoljne ispite
    //te ispisite najvecu ocjenu, najnizu ocjenu te prosjecnu ocjenu

    println("---------------------STUDENT--------------------")
    val student = Student("Pero", "Peric", "12345678910", "Algebra")

    student.examPassed(Exam("Java", 4))
    student.examPassed(Exam("Kotlin", 5))
    println("average = ${Student.averageGrade()}")
    println("best = ${Student.bestGrade()}")
    println("lowest = ${Student.lowestGrade()}")

    val student2 = Student("Ivo", "Ivic", "10987654321", "Algebra")
    student2.work()
    student2.examPassed(Exam("Android", 5))
    student2.examPassed(Exam("Kotlin", 5))
    println("average = ${Student.averageGrade()}")
    println("best = ${Student.bestGrade()}")
    println("lowest = ${Student.lowestGrade()}")

    println("--------------------------")
    val car = Car("BMW")
    car.turnOn()
    car.turnOff()
    println("----------COMPUTER-------------")
    val comp = Computer(ComputerType.NEW, "Intel")
    comp.turnOn()
    comp.enterBios()
    println("Booting up new comp ${comp.bootUp(16.0)}")
    comp.turnOff()

    val comp2 = Computer(ComputerType.OLD, "AMD")
    comp2.turnOn()
    comp2.enterBios()
    println("Booting up old comp ${comp2.bootUp(16.0)}")
    comp2.turnOff()








}