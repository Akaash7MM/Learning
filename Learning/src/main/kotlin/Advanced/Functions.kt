import Advanced.Example

fun main(){

    //takes object as parameter it is invoked on and returns the RESULT of the lambda expression
    val str = "Akash"
    val strlet = str.let { it.plus("Akash").let { it.plus("AkashdeepSingh") }
    }

    val letnested = str.let { outer ->
        outer.plus("outer")
        outer.let { inner ->
            inner.plus("inner")
        }
    }
    println(letnested)

    val string2 : String? = "let null check "
    val nullString : String? = null
    string2?.let {
        println(it)
    }

    //if ?. not there prints null othwerise let block is not executed
    nullString?.let {
        println(it)
    }


    //run function can change the values outside the run block but why are we defining it as val again
    var runVar = "This is an outside variable"
    println(runVar)
    runVar = run{
       val runVar = "This is inside the the run block "
        runVar
    }
    print(runVar)


    val example = Example("Crawl")
    example.extension("Jump")
    example extension "Roll"

    randomLambda {
        println("This is in the lambda block")
    }




}

inline fun randomLambda (func : () -> Unit) {
    func()
    println("Inside the random lambda function")
}

infix fun Example.extension(showWith : String) {

    powers.add(showWith)

    for(p in powers){
        println(p)
    }
}