package Advanced

fun customFun(string :String, block :String.() ->String,block2 :String.() ->String): String {
    val one = string.block()
    val two = one + block2(one)
    return two
}

fun customFun2(block: () -> Unit) {
    try{
        block()
    }
    catch (e : Exception){
        print("Caught")
    }
}


fun main(){
    val str = "Akash"

    // Only one block of lambda possible
//    val str2 = customFun(str){
//        plus("Deep")
//    }

    val str3 = customFun(str, block = {
        this.plus("Singh")
    },
    block2 = {
        this.plus("Deep")
    })

    println(str3)

    customFun2(){
        // try catch abstracted away
    }

    customFun2(block = {
        //
    })


    val lambdaFun = {str :String -> str.plus("LambdaFunction")}

    val newVal = lambdaFun("First String")

}
