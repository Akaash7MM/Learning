
//in kotlin any class by-default is sealed class declare as open for inheritence
open class Animal(){
    fun makeSound(){
        println("Make Generic Sound")
    }
}



open class WildAnimal:Animal()

open class DomesticAnimal:Animal()

class Tiger: WildAnimal()

class Dog: DomesticAnimal()

fun main(args:Array<String>) {
    val animal:Animal = Dog()
    animal.makeSound()

}