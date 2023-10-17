fun main() {
    var array = listOf(Horse(1), Horse(2), Horse(3), Horse(4), Horse(5))
    val play=Hippodrome(array)
    play.start()
    play.getWinner()
}