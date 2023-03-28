fun main(args: Array<String>) {
    dataClassExample()
    typeCastingExample()
    genericsExample()
}

fun genericsExample() {
    val myGeneric = MyGenericClass<Int>(2)
    myGeneric.display()
    val myApple = Apple()
    val myBanana = Banana()
    val myConsumer = Consumer<Banana>(myBanana)
    myConsumer.eat()
    val myConsumer2 = Consumer<Apple>(myApple)
    myConsumer2.eat()
}

fun typeCastingExample() {
    fun getCar(): Car = Bmw()
    val myStr = "myString"
    if(myStr is String){
        println("This string has ${myStr.length} characters")
    }
    val myCar = Bmw()
    if(myCar is Bmw){
        println("A BMW")
    }
    val myCar2 = Car()
    if(myCar2 !is Bmw){
        println("Not a BMW")
    }
    val myCar3 = getCar()
    if(myCar3 is Bmw){
        (myCar3 as Bmw).drive()
    }
    if(myCar3 is Bmw){
        (myCar3 as? Bmw)?.drive()
    }

}

fun dataClassExample() {
    println("dataClassExample: ")
    val myUser = MyDataClass("Renato", "renato@gmail.com", "12345678")
    val myUser2 = MyDataClass("Renato", "renato@gmail.com", "12345678")
    println(myUser) //memory address for regular class, data output for data class
    println(myUser2) //memory address for regular class, data output for data class
    println(myUser == myUser2) //true for data class, false for regular class
    val myUser3 = myUser2.copy(userPassword = "12345")
    println(myUser3)
}
