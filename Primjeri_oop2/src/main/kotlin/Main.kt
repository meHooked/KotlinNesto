fun main(args: Array<String>) {
   fishExample()
    scopeExample()
    shapeExample()
    interfaceExample()
    //Zadatak za vjezbu
    //Interface Animal koji ce implementirati svaka od zivotinja - fun makeSound()
    //Definirajmo 3 klase - Dog, Cat, Parrot i nek svaka od njih definira svoje glasanje
    //Napravimo for petlju, izgenerirajmo 5 random zivotinja i ispisimo njihovo glasanje
    animalExample()
}

fun animalExample() {
    val animalFactory = AnimalFactory()
    for(i in 0 until 5){
        val animal = animalFactory.getAnimal()
        animal.makeSound()
    }
}

fun interfaceExample() {
    println("interfaceExample: ")
    val myCoffeeShop = CoffeeShop()
    for(i in 0 until 10){
        val coffee = myCoffeeShop.generateCoffee()
        coffee.wakeUp()
        coffee.feelGood()
    }

}

fun shapeExample() {
    println("shapeExample: ")
    val mySquare = Square(5)
    val myRectangle = Rectangle(3, 4)
    println(mySquare.calculateArea())
    println(myRectangle.calculateArea())
    mySquare.sayHello()
    mySquare.sayHelloSquare()
    println(mySquare.calculateOpseg())
    println(myRectangle.calculateOpseg())

    val mySquare2: Shape = Square(1)
    println(mySquare2.calculateOpseg())
    println(mySquare2.b)
    //val myShape = Shape()
    exampleShapeFunction(mySquare)
    exampleShapeFunction(myRectangle)

}

fun exampleShapeFunction(s: Shape){
    println("Hello from exampleShapeFunction")
}

fun scopeExample() {
    println("scopeExample: ")
    val myCar = MyCar()
    myCar.revUp()
    val myVisibility = VisibilityClass()
    println(myVisibility.a)

}

fun fishExample() {
    println("fishExample: ")
    val myFish = Fish()
    myFish.swim()

    val myTuna = Tuna()
    myTuna.swim()
}
