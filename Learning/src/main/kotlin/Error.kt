import java.lang.Exception

class sampleException(val error: String): Exception(error)


fun main(){
    try {
        val a = 3
        val b = 0
        println("${a/b}")
    }
    catch (e:ArithmeticException){
        println("Just caught an error")
    }
    catch (e:sampleException){

    }
    finally {
        println("This will be executed no matter what")
    }


    val a = 50
    try {
        if(a==50){
            throw sampleException("this is 50 not allowed")
        }
    }
    catch (e:sampleException){
        e.printStackTrace()
    }

}

