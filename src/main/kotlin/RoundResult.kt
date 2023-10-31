class RoundResult(private val horses: List<Horse>) {

    var roundResult = Hippodrome(this.horses).playRound()

}