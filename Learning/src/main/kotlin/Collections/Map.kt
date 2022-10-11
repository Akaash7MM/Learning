package Collections

fun main(){
    //check jointoString
    val list = listOf<String>("Akash","Deep","Singh","Train","Car","Flight","Jet")
    println(list)


    //perform functions on every single item of the string. can be a extension of the item
    val mappedList = list.map {stringItem : String ->
        stringItem.plus(" mapped")
    }
    //just get index like forEachIndexed
    val mappedIndex = list.mapIndexed{ index, s ->
        s.plus("$index")
    }

    println(mappedIndex)



}