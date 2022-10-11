package Collections


// With flatten you just get a single list from a list of lists
// With flatmap you can further perform functions on the flatted list in the lambda block
fun main(){
    val list1 = listOf<String>("Akash","Deep","Singh")
    val list2 = listOf<String>("Car","Jet","Boat")

    val listoflist = listOf(list1,list2)

    val flatted = listoflist.flatten().forEach{
      //  println(it)
    }
    val flatmapped = listoflist.flatMap {
        it.map { it.plus("asd") }
    }.forEach{println(it)}

}