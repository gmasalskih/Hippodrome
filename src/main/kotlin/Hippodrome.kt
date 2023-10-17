class Hippodrome(private val horses: List<Horse>) {
    fun start() {
        println("Игра начинается")
        println("Введите число от 1 до 10")
    }

    private var round = readln()!!

    private fun isNumber(s: String?): Boolean {
        return if (s.isNullOrEmpty()) false else s.all { Character.isDigit(it) }
    }

    private fun playRound() {
        horses
            .sortedBy(Horse::speed)
            .reversed()
            .mapIndexed { index, horse -> "${index + 1} место $horse" }
            .forEach(::println)
    }

    private fun playRace() {
        val raceData = mutableMapOf<Horse, Int>()
        horses.forEach { raceData[it] = it.speed }
        for (i in 1..round.toInt() - 1) run {
//            repeat(round.toInt()) {
//            }
            horses.fold(raceData) { map, horse -> map[horse] = map[horse]!! + horse.generateNewSpeed(); map }

//            horses
//                .forEach { it.generateNewSpeed() }
//            horses
//                .sortedBy(Horse::speed)
//                .reversed()
//                .mapIndexed { index, horse -> "${index + 1} место $horse" }
//                .forEach(::println)

        }
        val winner = raceData.entries.sortedBy { it.value }.reversed()
        winner
            .mapIndexed { index, horse -> "${index + 1} место ${horse}" }
            .forEach(::println)
    }


    fun getWinner() {
        if (isNumber(round)) {
            if (round.toInt() == 1) {
                playRound()
            } else if (round.toInt() in 1..10) {
                playRace()
            }
        } else {
            println("Вы что-то не то ввели")
        }
    }
}