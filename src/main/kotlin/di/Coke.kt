package di

class Coke {
    private val water = Water(Hydrogen())
    fun make() {
        water.make()
    }
}