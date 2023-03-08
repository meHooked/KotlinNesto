import SwitchTest
fun main(args: Array<String>) {
    val x = 0
    val result = when(x) {
        0, 1 -> {
            "x == 0 or x == 1"
        }
        else -> {
            "otherwise"
        }
    }
    println(result)
    SwitchTest.sayHello()

    val myNum = 55
    val result2 = when {
        myNum in 1..9 -> "Single digit number"
        myNum in 10..99 ->"Two digit number"
        myNum in 100..999 -> "Three digit number"
        else -> "Number has more than 3 digits"
    }
    println(result2)

    val monthsWith31Days = setOf(1, 3, 5, 7, 8, 10, 12)
    val monthsWith30Days = setOf(4, 6, 9, 11)
    val monthsWith29Days = setOf(2)
    val num = 13
    val result3 = when(num){
        in monthsWith31Days -> "has 31 days"
        in monthsWith29Days -> "has 29 days"
        in monthsWith30Days -> " has 30 days"
        else -> "invalid input for a month"
    }
    println(result3)

    val month = "June"
    val days = when (month) {
        "January", "March", "May", "July", "August", "October", "December" -> 31
        "April", "June", "September", "November" -> 30
        "February" -> 29
        else -> {
            println("Wrong month name")
            0
        }
    }
    if (days != 0) {
        println("$month has $days days")
    }


}