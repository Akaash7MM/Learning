package Collections

//Zip to merge to lists together, assusmes the list size is going to be same, if the list size is not same then extra values get ignored
//The object type that is returend is a Pair
fun main(){
    val list1 = listOf<String>("Akash","Deep","Singh","Name","First")
    val list2 = listOf<String>("Car","Jet","Boat","Cow")

    val zipper = list1.zip(list2)

    val unzipper = zipper.unzip().also {
        println(it.first)
        print((it.second))
    }



}