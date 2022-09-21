enum class EnumCofeeSizes(val quantity:String) {
    MEGA("1000ml") {
        override fun getInfo() {
            println("This is the MEGA Coffee, 1L size")
        }
    },
    LARGE("750ml") {
        override fun getInfo() {
            println("This is the MEGA Coffee, 750ml size")

        }
    },
    MEDIUM("500ml") {
        override fun getInfo() {
            println("This is the MEGA Coffee, 500mml size")
        }
    },
    SMALL("250ml") {
        override fun getInfo() {
            println("This is the small Coffee, 250ml size")
        }
    };

    abstract fun getInfo()
}

class cofeeOrder(var orderSizes: EnumCofeeSizes)

fun main(){

    val myOrder = cofeeOrder(EnumCofeeSizes.MEGA)
    //prints the id
    println(myOrder.orderSizes.ordinal)
    //abstract method defined for each enum
    println(myOrder.orderSizes.getInfo())
    //accessed as data member of the enum
    print(myOrder.orderSizes.quantity)

    when(myOrder.orderSizes){
        EnumCofeeSizes.MEGA -> print("Mega")
        EnumCofeeSizes.LARGE -> print("Large")
        EnumCofeeSizes.MEDIUM -> print("Medium")
        EnumCofeeSizes.SMALL -> print("Small")
        else -> print("invalid size")
    }
}