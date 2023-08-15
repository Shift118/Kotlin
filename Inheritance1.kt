open class Op { // To make this class inheritable you must write open
    fun sum(n1: Double,n2: Double): Double{
        return n1+n2
    }
    fun sub(n1: Double,n2: Double): Double{
        return n1-n2
    }
}

class MultiOp: Op(){ // write :Op() is the way to Inherit the class
    fun mul(n1: Double,n2: Double): Double{
        return n1*n2
    }
    fun div(n1: Double,n2: Double): Double{
        return n1/n2
    }
}

fun main() {
    val operation = Op()
    val multiOperation = MultiOp()
    println( operation.sub(1.0,2.0))
    println( multiOperation.sum(3.0,4.0)) // Since it was inherited you can use the sum&sub function now
    println( multiOperation.mul(3.0,4.0))
}