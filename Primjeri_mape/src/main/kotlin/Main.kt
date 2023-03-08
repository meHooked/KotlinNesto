fun main(args: Array<String>) {
    //Skup key-value parova
    //Keys (kljucevi) su jedinstveni, vrijednosti (values) ne moraju biti jedinstvene

    val exampleMap = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(exampleMap)

    val emptyMap = mapOf<Int, String>()
    println(emptyMap)

    println(exampleMap[2])

    val exampleMap2 = mapOf(Pair(1.5, "one"), Pair(2.3, "two"), Pair(3.1, "one"))
    println(exampleMap2)
    println(exampleMap2[3.1])
    val exampleMap2Keys = exampleMap2.keys
    println(exampleMap2Keys)
    val exampleMap2Values = exampleMap2.values
    println(exampleMap2Values)

    //Hashmap
    println("----------------------HASHMAP---------------------------")
    val exampleHashMap = hashMapOf(Pair(4, "four"), Pair(5, "five"), Pair(6, "six"))
    println(exampleHashMap)
    exampleHashMap[7] = "seven"
    println(exampleHashMap)
    exampleHashMap.putAll(exampleMap)
    println(exampleHashMap)
    exampleHashMap.remove(7)
    println(exampleHashMap)
    exampleHashMap.clear()
    println(exampleHashMap)
    //
    println(exampleHashMap.size)
    println(exampleHashMap.containsKey(2))
    println(exampleMap.containsValue("one"))
}