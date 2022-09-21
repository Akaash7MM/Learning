
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
    fun teeth(){
         println("Sharp Teeth")
     }

 }

fun SwordFish.toFish() : Fish{
    return Fish(length,animalType="Defense")
}

fun SwordFish.teeth(){
    println("teeth in extension")
}
    //Extension function allows us to add functions to existing classes and access them for every instance of that class
    // they are similar to static functions of a class but can be defined elsewehere too
    // if there is a conflict between function name in class body and extension function, the one in class has precedence
    fun main() {

        val marineAnimal:MarineAnimal = SwordFish(animalType = "Attack", length = "4m",true)
       ( marineAnimal as SwordFish).toFish().fishType()
        marineAnimal.teeth()


    }
