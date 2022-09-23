import java.time.Duration

@JvmInline
value class Value constructor(
    val timePeriod:Long
) {
    /* companion object{
        fun millis(millis : Long) = Value(millis)

        fun seconds(seconds:Long) = Value(seconds*1000)
    } */

}

fun display(message:String,duration: Value){
    println("${duration.hashCode()}")
}
// value keywords is used so that the object is treated as a value instead of object as object creation is really costly
// Cant declare other var val , the one in constructor is used as value,no multiple constructor parameters
// Beneficial in use cases like this TimePeriod class with the companion object functions for conversion and clarity of purpose
fun main(){
    display("TEST",Value(2000))
    display("TEST",Value(2))

}