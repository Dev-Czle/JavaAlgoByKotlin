package di

class Water(val hydrogen: Hydrogen) {
    fun make(){
        hydrogen.atom()
    }
}