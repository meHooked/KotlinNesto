fun main(args: Array<String>) {
   for(arg in args){
       println(arg)
   }
    //Enums
    val color = Colors.RED
    println("------------------COLORS------------------------")
    chooseColor(color)
    println(Colors.RED.timesUsed)
    println(Colors.GREEN.name)
    println(Colors.RED.ordinal)
    println(getWarmth(Colors.RED))
    println("-------------------MEDALS-----------------------")
    println(getMedal(1))
    println(getMedal(10))
    println(getPosition(Medal.SILVER))
    println(getPosition(Medal.NONE))

}

fun chooseColor(color: Colors) {
    when(color){
        Colors.RED -> println("You chose red")
        Colors.GREEN -> println("You chose green")
        Colors.BLUE -> println("You chose blue")
        Colors.ORANGE -> println("You chose orange")
        Colors.YELLOW -> println("You chose yellow")
    }
}

enum class Colors(val timesUsed: Int) {
    RED(0x34), // 34 u dekadskom = 3 * 10^1 + 4 * 10^0 = 30 + 4
    //34 u hex je 3 * 16^1 + 4 * 16^0 = 48 + 4 = 52
    GREEN(0x12),
    BLUE(0x7),
    ORANGE(0),
    YELLOW(0),
}

fun getWarmth(color: Colors) = when(color){
    Colors.RED, Colors.YELLOW, Colors.ORANGE -> "Warm"
    Colors.GREEN -> "Neutral"
    Colors.BLUE -> "Cold"
}

enum class Medal(val position: Int){
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

fun getMedal(position: Int): Medal{
    return when(position){
        1 -> Medal.GOLD
        2 -> Medal.SILVER
        3 -> Medal.BRONZE
        else -> Medal.NONE
    }
}

fun getPosition(medal: Medal) = medal.position