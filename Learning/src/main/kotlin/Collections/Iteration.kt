package Collections

fun main() {
        val list = listOf<String>("Akash","Deep","Singh","Train","Car","Flight","Jet")


        for((index,item) in list.withIndex()){
            println("$index$item")
        }

        list.forEach{ stringItem ->
            println(stringItem)
        }
        list.forEachIndexed { index, stringItem ->
            println("${index+1} : $stringItem")
        }
        for (item in list){
            println(item)
        }

        list.iterator().let {iterator ->
            while(iterator.hasNext()){
                val item = iterator.next()
                println(item)
            }
        }

}
