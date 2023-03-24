fun zadatak2(){
    val input = readLine()?.toInt() ?: 2
    for(i in 2 until input){
        if(input % i == 0){
            println("Not a prime number")
            return
        }
    }
    println("Prime number")
}