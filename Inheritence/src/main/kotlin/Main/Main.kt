package Main
//in kotlin any class by-default is sealed class declare as open for inheritence
open class Animal(){
    open fun makeSound(){
        println("Make Generic Sound")
    }
}

open class WildAnimal: Animal(){
    override fun makeSound() {
        println("Make Wild Animal Sound")
    }
}

open class DomesticAnimal: Animal(){
    override fun makeSound() {
        println("Make Domestic Animal Sound")
    }

}

class Tiger: WildAnimal(){
    override fun makeSound() {
        println("Roar")
    }
}

class Dog: DomesticAnimal(){
    override fun makeSound() {
        println("Bark")
    }

    fun wagTail(){
        println("*Wags Tail*")
    }
}

class Cat: DomesticAnimal(){
    override fun makeSound() {
        println("Meow")
    }
    fun lickPaw(){
        println("*Licks Paw*")
    }

}


fun main(args:Array<String>) {
    val animal: Animal = Dog()
    animal.makeSound()

    // Doesnt work if upcasted
    // only overriden methods can be accessed when upcasted
    /*  animal.wagTail()  */

    val dog:Dog = Dog()
    dog.wagTail()

    val dog2:Dog = Dog()
    //animalAction(dog2) - will throw error in this function body case

    val myCat:Cat = Cat()
    animalAction(myCat)


}

fun animalAction (domesticAnimal: DomesticAnimal){
    domesticAnimal.makeSound()

    //Doesnt work without casting,
    // if the function is given a non cat domestic animal throws error
    val myCat: Cat = domesticAnimal as Cat
    myCat.lickPaw()
}