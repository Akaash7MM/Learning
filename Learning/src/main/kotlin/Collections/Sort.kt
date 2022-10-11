package Collections


//Sorting functions can give property to sort by or use internal sorting definitions like ascending descending
//Also you can shuffle the list
fun main(){

    val list = listOf<String>("Akash","Deep","Singh","Train","Car","Flight","Jet").sorted().also { print(it) }
    list.sortedBy {
        it.length
    }.also { println(it) }

    // doesnt make any changes to the original list you can get the list result though
    list.sortedByDescending {
        it.length
    }.also { println(it) }

    list.reversed().also { println(it) }

    list.shuffled().also { println(it) }

}