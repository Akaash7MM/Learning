class NestedInner(
    val name:String,
    val gender:String,
    val address:Address
    ) {
    open class Address(
        val street:String,
        val houseNo:String
    ){
        fun getData(){
            //works
            println("$street")
            //doesnt work
            //println("$name")

        }

    }

}

class Car(
    val name:String,
    val fuel:String,
    var inEngine: InnerEngine?
){
    open inner class InnerEngine(
        val horsePower:String
    ){
        //Can access outer class data members
        fun carInfo(){
            println("this car is $name of fuel type $fuel with H.P of $horsePower")
        }
    }
}

// Nested class is just normal class but inside another can be accessed like another class
// Inner Class cant be extended and can be intialized after creating the outerclass initialization
fun main(){

    val person = NestedInner(name = "akash","male",NestedInner.Address("Grove Street","8"))
    person.address.getData()


    val car = Car("Impala","Petrol",null)
    car.inEngine = car.InnerEngine("300hp")
    println(car.inEngine?.carInfo())

    //Works
    val test = object : NestedInner.Address("test","Asd") {

    }
    //Doesnt Work
    //val test2 = object: Car.innerEngine()


}