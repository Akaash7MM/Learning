data class Person(val name:String,val age:Int){
    val gender:String? = null
}

fun main(){
    val person:Person = Person("Jack",21)
    val person2 = person.copy(name = "Jordan")

    val (name,age) = person
    println("$name $age")
    println(person2)
}
