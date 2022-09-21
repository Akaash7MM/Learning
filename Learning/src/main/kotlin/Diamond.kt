interface Diamond {
    fun shine()
}

interface A : Diamond{
    override fun shine() {
        println("it Does")
    }
}

interface B : Diamond{
    override fun shine() {
        println("it Doesnt")
    }
}

class DiamondShine():A,B{
    override fun shine() {
        super<A>.shine()
        super<B>.shine()
    }

}

fun main(){
    val diamondShine = DiamondShine()
    diamondShine.shine()
}
