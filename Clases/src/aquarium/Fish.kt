package aquarium

class Fish (val friendly: Boolean = true, volumeNeeded: Int){
    val size: Int

    init {
        println("first init block")
    }
    constructor() : this( friendly = true, volumeNeeded = 9) {
        println("running secondary constructor")
    }
    init {
        if(friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }
    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }
    init {
        println("last init block")
    }
}
fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}

fun main() {
    val fish = Fish()
    makeDefaultFish()
    fishExample()
}