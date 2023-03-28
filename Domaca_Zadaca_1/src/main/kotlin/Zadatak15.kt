//Zadatak 15:
/*
Napravite funkciju isPalindrome() koja će za predani string vratiti true ukoliko je string palindrom i false ukoliko nije.
(Napomena: rijec je palindrom ukoliko se jednako cita s pocetka i s kraja, "ana" je palindrom , "ananas" nije)
 */
fun main(){
    zadatak15()
}

fun zadatak15() {
    val palindrome = "ana"
    println(isPalindrome(palindrome))
}

fun isPalindrome(word: String): Boolean {
    var i = 0
    val j = word.length - 1
    while (i < j / 2) {
        if (word[i] != word[j - i]) {
            println("word is not palindrom")
            return false
        }
        i++
    }
    println("The word is palindrome")
    return true
}
