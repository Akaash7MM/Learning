open class Objects {
    open fun testMethod(){
        println("This is a test method")
    }

    companion object{
        fun printStuff(){
            println("This is inside a companion object")
        }
    }
}

// We can extend a class with an object and assign it, To treat it like a normal class.
// This is done to have cleaner code, to prevent class creation if there is not much functionality to it.
// Instead of using static we have companion objects in kotlin
// companion objects belong to the class that are they written it, and we don't need to instantiate the class to access it.
fun main(){
    val test = object : Objects() {
        override fun testMethod() {
            println("object method")
        }
    }
    Objects.printStuff()
    println(test is Objects)
    test.testMethod()
}