class Hippodrome(private val horses: List<Horse>) {

   // private var round = game.userChoice

    fun playRound() {
        horses
            .sortedBy(Horse::speed)
            .reversed()
            .mapIndexed { index, horse -> "${index + 1} место $horse" }
            .forEach(::println)
    }

    fun playRace(userChoice: Int) {
        val raceData = mutableMapOf<Horse, Int>()
        for (i in 1..userChoice) {
            horses.forEach { it.generateNewSpeed() }
            horses.fold(raceData) { map, horse -> map[horse] = map.getOrDefault(horse, 0) + horse.speed; map }
        }
        val tempResult = horses.toMutableList().map { horse ->
            val sumSpeed = raceData[horse] ?: 0
            horse.copy() to sumSpeed
        }
            .sortedByDescending { it.second }.map { it.first.speed = it.second; it.first }

        tempResult
            .mapIndexed { index, horse -> "${index + 1} место $horse" }
            .forEach(::println)

    }
}




