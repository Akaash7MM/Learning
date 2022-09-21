
abstract class MarineAnimal(){
    abstract val animalType: String
    abstract fun finCount()
    val test : String = "yes"
    fun tailFinSize(){
        println("Generally Long")
    }
}
open class Fish(open val length :String, override val animalType: String):MarineAnimal() {

    override fun finCount() {
        println("Generally has two fins")
    }

    open fun fishType(){
        println("A fish can have multiple types, one of the type is $animalType")
    }

}

 class SwordFish( override val animalType: String , override val length: String ) : Fish( animalType, length ){

    override fun finCount() {
        println("Swordfish has 2 fins ")
    }

    override fun fishType() {
        println("it is an $animalType type fish")
    }


}
    // An abstract class can have both abstract function and abstract data members that need to implemented by the child classes
    // An abstract class can also have normal function and data members
    // data members can be overriden in the constructor and also open data members can be declared that can be overriden in child class constructors
    fun main() {

        val marineAnimal:MarineAnimal = SwordFish(animalType = "Attack", length = "4m")

        //works overriden from MarineAnimal
        marineAnimal.finCount()

        //Doesnt work because overriden from Fish
        /*      marineAnimal.fishType()
                marineAnimal.length()       */

        val fish:Fish = SwordFish("Attack", length = "5m")

        // works part of parent class MarineAnimal
        fish.tailFinSize()



    }
