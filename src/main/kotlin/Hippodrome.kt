class Hippodrome(private val horses: List<Horse>) {

    fun playRound(): List<String> {
        return horses
            .sortedBy(Horse::speed)
            .reversed()
            .mapIndexed { index, horse -> "${index + 1} место $horse" }
    }
}




