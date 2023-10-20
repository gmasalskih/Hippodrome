class Game (private val horses: List<Horse>) {

    var isValidRound = false
    var userChoice = ""

    var winner = ResultOfGame(horses)

    fun start(): Int {

        while (!isValidRound) {
            println("Игра начинается")
            println("Введите число от 1 до 10")

                val userInput = readln()
                    if (userInput != null && userInput.toIntOrNull() in 0..10) {
                        isValidRound = true
                        userChoice = userInput
                    }
                    if (!isValidRound) {
                        println("Вы ввели что-то не то")
                    }
                 }
                return userChoice.toInt()
         }

    fun choiceWin(){
        winner.getWinner(userChoice.toInt())
    }

    }

