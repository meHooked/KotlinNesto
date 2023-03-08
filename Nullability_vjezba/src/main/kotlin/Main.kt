fun main(args: Array<String>) {
    //Zadatak 1 - Declare a nullable variable of type String and give it a value. Print out a substring of it
    //from position 2 to 4
    var variable: String? = "proba"
    println("Selection ${variable?.substring(2,4)}")

    //Zadatak 2 - Declare a nullable variable of type Double, multiply it by 6, convert it to a Float and print it to the console
    val num: Double? = 5.0
    val floatNum = num?.times(6)?.toFloat()
    println(floatNum)

    //Zadatak 3 - Receive the name of the user from the console. Print out the length of the name
    println("Enter the user's name: ")
    var user = readLine()
    println("User's name length is ${user?.length}")

    //Zadatak 4 - Read a message from the console. Print out either the message or a default greeting "Hi"
    // (assume that readline can return a null value)
    println("Enter a greeting: ")
    val greeting = readLine() ?: "Hi"
    println(greeting)


    //Zadatak 5 - Read a number from the console
    //Assume you know that the user has entered a value, and the read variable is not null
    //Multiply that number by 5 and print the result
    println("Enter number")
    var myNum: Float? = readLine()?.toFloat()
    println(myNum!! * 5)

    //------------------------DZ-------------------------------
    //Zadatak 6(DZ) - Read a number from the console and convert it to Double. Multiply it by 7
    //and convert the result into a string
    //Print the length of that string to the console






}