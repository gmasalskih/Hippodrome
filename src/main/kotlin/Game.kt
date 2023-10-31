class Game(private val horses: List<Horse>) {


    private val manager = Manager(this.horses)
    fun play() {
        while (true) {
            manager.choiceWin()
            break
        }
    }
}



