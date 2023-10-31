class UserChoice {

    fun start(): Int {
        var userChoice = " "
        var isValidRound = false
        println(Const.privetstvie)

        while (!isValidRound) {
            try {
                println(Const.vvediteChislo)
                val userInput = readln()

                if (userInput != null && userInput.toIntOrNull() in 0..10) {
                    isValidRound = true
                    userChoice = userInput
                }

                    if (!isValidRound){

                    println("Вы ввели что-то не то")
                }

            } catch (e: Exception) {
                println("Ничего не введено")
            }

        }
        return userChoice.toInt()
    }
}