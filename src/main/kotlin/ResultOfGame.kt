class ResultOfGame(private val horses: List<Horse>) {

   // private var userChoice = game.userChoice
    private val getWinnerRound = Hippodrome(horses)
    private val getWinnerRace = Hippodrome(horses)

    fun getWinner(userChoice: Int) {
            if (userChoice == 1) {
                getWinnerRound.playRound()
            } else if (userChoice in 1..10) {
                getWinnerRace.playRace(userChoice)
            }
    }

}




