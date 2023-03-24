fun main(args: Array<String>) {
    println("Input a number: ")
   val input = readLine()
    try {
        println(input?.toDouble())
    } catch (e: Exception){
        println("An exception has occured!")
        e.printStackTrace()
    } finally {
        println("The execution has completed")
    }

    var input2 = readLine()
    if("".equals(input2)){
        throw Exception("Wrong input")
    }
    println("I'm done")

    //Unesite broj kuna preko konzole, ispisite koliko je to eura, te uhvatite iznimku (exception) ukoliko se input parametar
    //ne moze konvertirati u double

    println("Input value in HRK: ")
    val input3 = readLine()
    try {
        val euro = input3?.toDouble()?.div(7.5354)
        println("Value in euros is $euro")
    } catch (e: Exception){
        println("Could not parse input to double")
        e.printStackTrace()
    }

    val a: Int? = try {
        input3?.toDouble()?.toInt()
    } catch (e: Exception){
        null
    }

    println(a)
}