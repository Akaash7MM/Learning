
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

 class SwordFish(
     override val animalType: String ,
     override val length: String,
     override val canPretendDie: Boolean
     ) : Fish( animalType, length ),FishAbilities{

    override fun finCount() {
        println("Swordfish has 2 fins ")
    }

    override fun fishType() {
        println("it is an $animalType type fish")
    }

     override fun flys() {
         println("This fish cant fly even for few seconds")
     }

 }
   //Property initialization is not allowed in interfaces
   //Cannot extend multiple classes but can implement multiple interfaces
   //Interfaces can implement multiple interfaces

    //Abstract classes generalize behaviour, interfaces standardize
    // reason why multiple inheritance is not allowed is it matters what is being adopted in generalization
    //While interfaces are just contracts than we need to adhere to. use super<T> for ambiguity
    fun main() {

        val marineAnimal:MarineAnimal = SwordFish(animalType = "Attack", length = "4m",true)
       ( marineAnimal as SwordFish).flys()


    }
