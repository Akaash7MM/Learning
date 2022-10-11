package Collections

//useful to divide lists depending on an boolean condition
fun main() {
    val list1 = listOf<String>("Akash","Deep","Singh","aaaaaa")

    val list = list1.partition {
        it.any {
            it.equals('a')
        }
    }.also { println(it.first)
        println(it.second)}

}