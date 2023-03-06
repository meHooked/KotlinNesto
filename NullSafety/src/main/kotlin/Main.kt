fun main(args: Array<String>) {
    //Null vrijednost (null value) - no value present
    //Koristenje varijable s null vrijednosti baca NullPointerException (NPE) - crasha program
    //Tip varijable koja moze biti null ima znak '?'

    //Primjer:
    val herName: String = "Ana"
    println(herName)
    println(herName.length)

    val hisName: String? = null

    var myNullableName: String? = "Renato"
    myNullableName = null
    println(myNullableName)

    ////////////////////////////////
    //Null-safe calls
    var dogName: String? = "Rex"
    println(dogName?.length)
    dogName = null
    println(dogName?.length?.toString())

    var a: Int? = 10
    println(a?.times(10)) // ili ?.plus, ?.minus, ?.div, ...
    a = null
    println(a?.times(10))

    //Elvis operator ?:
    println(a?: 20)
    a = null
    println(a ?: 20)

    //Non-null assertion (!!)- bypasses null-safety - AVOID!
//    var nonNullDogName: String = dogName!!
//    println(nonNullDogName.length)
//    println("Input something: ")
//    val myInput = readLine()
//    println(myInput?.length)

    val myValue2 = a ?: 30
    println(myValue2.toString().length)

    //COLLECTIONS

    //List - ordered collection that can contain duplicate elements, immutable
    println("---------------COLLECTIONS------------------------")
    val colors = listOf("red", "blue", "green")
    println(colors)

    val colors2 = listOf("red", "blue", null, null)
    println(colors2)
    println(colors2[0])
    println(colors2.size)
    println(colors2[1]?.length)

    val colors3 = listOf<String>()
    println(colors3)
    println(colors3.size)
    println(colors3.isEmpty())
    println(colors3.contains("test"))

    // Mutable liste
    val colors4 = arrayListOf<String?>("blue", "red")
    println(colors4)
    colors4.add("green")
    colors4.add(0, "grey")
    println(colors4)
    colors4.addAll(colors2)
    println(colors4)
    colors4.removeAll(listOf("blue", "red"))
    println(colors4)
    colors4.removeAt(0)
    println(colors4)
    colors4.clear()
    println(colors4)
    println(colors4.isEmpty())

    val colors5 = listOf("red", "green")
    val colors6 = arrayListOf("red", "green")
    println(colors5 == colors6)
    colors6.remove("red")
    println(colors5 == colors6)

    //Sets
    val numbersSet = setOf(1, 2, 2, 3, null, null)
    println(numbersSet)
    println(numbersSet.contains(1))
    println(numbersSet.size)
    println(numbersSet.isEmpty())

    var numbersHashSet = hashSetOf(1, 2, 2, 3, null, null)
    println(numbersHashSet)
    numbersHashSet.add(5)
    println(numbersHashSet)

    var colorsHashSet = hashSetOf("blue", "red")
    colorsHashSet.addAll(colors5)
    println(colorsHashSet)


}