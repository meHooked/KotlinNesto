//Zadatak 14:
/*
Napravite funkciju koja će primati niz znakova(string) te posebno još jedan znak(char)
 te ispišite koliko puta se taj znak pojavljuje u tome stringu.
 */
fun main(){
    zadatak14()
}

fun zadatak14() {
    val myStr = "Sto je danas lijepi suncan dan"
    val myChar = 'a'
    println(noOfOccurences(myStr, myChar))
    countCharOccurrences(myStr, myChar)
    println(noOfOccurencesForLoop(myStr, myChar))
    //countCharOccurences(myStr, myChar, myStr.length - 1);
}

//fun countCharOccurences(myStr: String, myChar: Char, i: Int) : Int {
//    if(i == 0) return if(myStr[i] == myChar) 1 else 0
//    else return if(myStr[i] == myChar) 1 else 0 countCharOccurrences(myStr, myChar, i--)
//
//}

fun noOfOccurences(myStr: String, myChar: Char): Int = myStr.map { if(it == myChar) 1 else 0}.sum()

fun noOfOccurencesForLoop(myStr: String, myChar: Char) : Int {
    var counter = 0
    for(element in myStr){
        if(element == myChar){
            counter++
        }
    }
    return counter
}

fun countCharOccurrences(inputString: String, targetChar: Char) {
    val charCount = inputString.count { it == targetChar }
    println("Znak $targetChar se pojavljuje $charCount puta u nizu znakova: $inputString")
}
