var board = arrayListOf<ArrayList<Player>>()
var moveNo = 1
var isFinished = false

enum class Player {
    X,
    O,
    NONE
}

fun main(args: Array<String>) {
    initBoard()
    printBoard()
    playGame()
}

fun playGame() {
    do {
        println("Please enter a position")
        val input = readLine() ?: "" // trazimo input u obliku 1,1
        var x = 0
        var y = 0
        try {
            val positions = input.split(",")
            x = positions[0].trim().toInt()
            y = positions[1].trim().toInt()
            if (board[x - 1][y - 1] != Player.NONE) {
                println("The position is already taken, try again!")
            } else {
                val player = getPlayer(moveNo)
                board[x - 1][y - 1] = player
                printBoard()
                if (checkWinner(player) != Player.NONE || moveNo == 9) {
                    isFinished = true
                    println("--------------GAME FINISHED---------------")
                    if(checkWinner(player) == Player.NONE){
                        println("It's a tie!")
                    } else {
                        println("The winner is player ${checkWinner(player)}")
                    }

                } else {
                    moveNo++
                }

            }
        } catch (e: Exception) {
            println("Invalid input, please try again!")
        }
    } while (!isFinished)
}

fun checkWinner(player: Player): Player {
    var winner = Player.NONE
    for(i in 0..2){
        if(checkHorizontalWins(i, player) != Player.NONE || checkVerticalWins(i, player) != Player.NONE){
            winner = player
        }
    }
    if(winner == Player.NONE){
        winner = checkDiagonalWins(player)
    }
    return winner
}

fun checkDiagonalWins(player: Player): Player {
    if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
        return player
    }
    else if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
        return player
    }
    else {
        return Player.NONE
    }
}

fun checkVerticalWins(i: Int, player: Player): Player {
    if(board[0][i] == player && board[1][i] == player && board[2][i] == player){
        return player
    }
    return Player.NONE
}

fun checkHorizontalWins(i: Int, player: Player): Player {
    if(board[i][0] == player && board[i][1] == player && board[i][2] == player){
        return player
    }
    return Player.NONE
}



fun getPlayer(moveNo: Int): Player {
    var player = if (moveNo % 2 == 0) {
        Player.O
    } else {
        Player.X
    }
    return player
}

fun initBoard() {
    for (i in 0..2) {
        val row = arrayListOf<Player>()
        for (j in 0..2) {
            row.add(Player.NONE)
        }
        board.add(row)
    }
}

fun printBoard() {
    println("-----------")
    for (i in 0..2) {
        for (j in 0..2) {
            when (board[i][j]) {
                Player.X -> print("| X ")
                Player.O -> print("| O ")
                else -> print("|  ")
            }
        }
        println("|")
        println("-----------")
    }
}
