fun main(args: Array<String>) {
   carExamples()
   mathExamples()
   singletonExample()
   garageExample()
   inheritanceExample()
   constructorsExample()
   laptopExample()
   personExample()
   javaExample()
}

fun javaExample() {
   println("javaExample: ")
   val javaDog = GoldenRetriever()
   javaDog.bark()
   javaDog.dogName = "Max"
   println(javaDog.dogName)
   println(javaDog)
}

fun personExample() {
   val myPerson = Person()
   myPerson.firstName = "Ante"
   myPerson.lastName = "Horvat"
   myPerson.updateFullName()
   println(myPerson.fullName)
}

fun laptopExample() {
   println("laptopExample")
   val myLaptop = Laptop("Linux")
   println(Laptop.laptopCounter)
   val myLaptop2 = Laptop("Windows")
   println(Laptop.laptopCounter)
   val myLaptop3 = Laptop("Macos")
   println(Laptop.laptopCounter)
   println(myLaptop)

}

fun constructorsExample() {
   println("constructorsExample")
   val myBicycle = Bicycle()
   println(myBicycle.model)
   println(myBicycle.topSpeed)

   val myBicycle2 = Bicycle("Kilimanjaro")
   println(myBicycle2.model)
   println(myBicycle2.topSpeed)

   val myBicycle3 = Bicycle("Trek", 40)
   println(myBicycle3.model)
   println(myBicycle3.topSpeed)
   myBicycle3.topSpeed = 50

}

fun inheritanceExample() {
   println("Inheritance Example: ")
   val myDog = Dog()
   myDog.bark()
   val myBerneseMountainDog = BerneseMountainDog()
   myBerneseMountainDog.bark()
   val myBorderCollie = BorderCollie()
   myBorderCollie.bark()
   myBorderCollie.play()
   myBorderCollie.size = 60
   println(myBorderCollie.size)
}

fun garageExample() {
   println("garageExample: ")
   var myGarage = Garage()
   myGarage.car.drive(50)
}

fun singletonExample() {
   println("singletonExample: ")
   val mySingleton = MySingleton
   println(mySingleton.connected)
   mySingleton.connect()
   println(mySingleton.connected)
   val mySingleton2 = MySingleton
   println(mySingleton2.connected)

   println(MySingleton.connected)

}

fun mathExamples() {
   println("mathExamples: ")
   var myMath = MyIntegerMath()
   println(myMath.add(1,2))
   println(myMath.sub(1,2))
   println(myMath.mul(1,2))
   println(myMath.div(1,2))

}

fun carExamples() {
   println("carExamples: ")
   val myCar = Car()
   val yourCar = Car()

   myCar.model = "BMW f30"
   myCar.topSpeed = 220
   myCar.start()
   myCar.drive(100)

   yourCar.model = "Audi A6 3.0 TDi Quattro"
   yourCar.start()
   yourCar.drive(130)

}
