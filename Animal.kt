open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10
    open fun makeNoise(){
        println("Животное издает звуки")
    }
    open fun eat(){
        println("Животное ест")
    }
    open fun roam(){
        println("Животное бродит")
    }
    open fun sleep(){
        println("Животное спит")
    }
}