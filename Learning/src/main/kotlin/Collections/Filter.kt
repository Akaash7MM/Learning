package Collections

// Using filter we can define the condition for item that will be stored in the new list,
// essentially needs to be a boolean screen/filtering the list item
// Predicated are condtions on a item/object after which it can return a boolean
fun main (){

    val list1 = listOf<String>("Akash","Deep","Singh","aaaaaa")

    val filteredList = list1.filter {
        it.any {
            it.equals('a')
        }
    }.forEach{
        println(it+" Any A")
    }

    val filteredList2 = list1.filter {
        it.none {
            it.equals('a')
        }
    }.forEach{
        println(it+" None of them is A")
    }
    val filteredList3 = list1.filter {
        it.all {
            it.equals('a')
        }
    }.forEach{
        println(it+" All A")
    }


    val listNot = list1.filterNot {
        it.length < 1
    }.forEach{
        println(it+" Filter Not")
    }

}