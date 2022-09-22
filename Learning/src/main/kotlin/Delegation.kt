interface Engine{
    fun runsOn()
    fun transmissionType()
}

class ElectricEngine():Engine{
    override fun runsOn() {
        println("This engine runs on Electricity")
    }

    override fun transmissionType() {
        println("Automatic")
    }
}

class Delegation(val engine : Engine) : Engine by engine{

    val carName : String by lazy {
        "Tesla Roadster"
    }

    override fun transmissionType() {
        println("This has manual transmission")
    }
}

// Delegation by lazy gives the value when it is first accessed so it should be used when accessing values that take alot of time/ are heavy to load
// by keyword can be used delegate the access of public methods to the object that implements that interface
// so that we dont need to repeat the implementation of the same
fun main(){

    val sampleEngine = ElectricEngine()
    val delegated = Delegation(sampleEngine)

    delegated.runsOn()
    delegated.transmissionType()
    println(delegated.carName)


}