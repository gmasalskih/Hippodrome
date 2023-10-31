class Manager(private val horses: List<Horse>) {

    private val userChoice = UserChoice().start()
    private val winner = ResultOfGame(this.horses)

    fun choiceWin(){
        winner.resultOfWin(userChoice)
    }
}