fun main(args: Array<String>) {
    println("Input a boolean value. Is it night time?")

    val input = readLine() ?: "true"
    val night = input.toBoolean()

    if(night){
        println("Sleep")
    } else {
        println("Be awake")
    }
    val a = 12
    val b = 12


    val myMax = if(a < b){
        println("$b is greater than $a")
        b
    } else {
        println("$a is greater or equal than $b")
        a
    }
    val myName = "Ivan"
    if(myName.length < 4){
        println("Hi $myName!!")
    }
    println(myMax)

    println("------------------------------------------")
    val myNum = 5555
    if(myNum >= 0 && myNum < 10){
        println("Single digit number")
    } else if (myNum >= 10 && myNum < 100){
        println("Two digit number")
    } else if (myNum >= 100 && myNum < 1000){
        println("Three digit number")
    } else {
        println("Number has more than 3 digits")
    }

    val result = if (myNum >= 0 && myNum < 10){
        "Single digit number"
    } else if (myNum >= 10 && myNum < 100){
        "Two digit number"
    } else if (myNum >= 100 && myNum < 1000){
        "Three digit number"
    } else {
        "Number has more than 3 digits"
    }
    println(result)

    val petStore = listOf("cat", "dog", "rabbit")
    val hasCatFood = true

    if(petStore.contains("cat")){
        if(hasCatFood){
            println("Buy cat and cat food")
        } else {
            println("Buy cat only")
        }
    } else {
        println("Ask the store owner to get a cat")
    }

    val number = 26
    val isEven = if(number % 2 == 0) true else false
    println(isEven)

    //
    val favouritePet = "dog"
    val availablePets = listOf("dog", "cat", "fish")
    if(favouritePet in availablePets){
        println("We have your favourite pet")
    } else {
        println("Sorry, $favouritePet is not available")
    }

    //
    val exampleNumber = 9
    if(exampleNumber in 0..9){
        println("Single digit number")
    } else {
        println("Number is not single digit")
    }
}