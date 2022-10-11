package Collections

//useful for getting performing a operation on the list items to get some useful data eg. total price of the books in a list, acc + book price
// sumOf does both the mapping and accumulation
// minBy/maxBy can be used to get min max value depending on the property of the item
fun main() {
    val list1 = listOf<String>("Akash","Deep","Singh")
    val list2 = listOf<String>("Car","Jet","Boat")

   val reduced = list1.reduce(){ acc, s ->
        acc.plus(s)
    }.also { println(it) }

    val minBylist = list1.minBy {
        it.length
    }.also { print(it) }

    list1.sumOf {
        it.length
    }.also{ print(it) }
}