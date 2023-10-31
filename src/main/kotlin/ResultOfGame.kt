class ResultOfGame(private val horses: List<Horse>) {

    private val winnerRound = RoundResult(horses)

    fun resultOfWin(userChoice:Int) {
            if (userChoice == 1) {
                winnerRound.roundResult.forEach(::println)
            } else if (userChoice in 1..Const.max) {
                playRace(userChoice)
            }
    }

    fun playRace(userChoice: Int) {
        val raceData = mutableMapOf<Horse, Int>()
        for (i in 1..userChoice) {
            horses.forEach { it.generateNewSpeed() }
            horses.fold(raceData) { map, horse -> map[horse] = map.getOrDefault(horse, 0) + horse.speed; map }
        }
        val tempResult = horses.toMutableList().map { horse ->
            val sumSpeed = raceData[horse] ?: 0
            horse.copyData() to sumSpeed
        }
            .sortedByDescending { it.second }.map { it.first.speed = it.second; it.first }

        tempResult
            .mapIndexed { index, horse -> "${index + 1} место $horse" }
            .forEach(::println)
    }
}




