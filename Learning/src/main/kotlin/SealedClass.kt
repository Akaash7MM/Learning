//Sealed class cant be extended outside of this class
// can be used to send events from compose to viewmodel cleanely
sealed class SealedClass(){
    object UiEvent:SealedClass()
    data class addNote(val id :String):SealedClass()
}
