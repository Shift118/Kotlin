fun payWithCash(amount: Double): Boolean{
    println("Cash Payment Success!")
    return true
}
fun payWithCard(amount: Double): Boolean{
    println("Card Payment Success!")
    return true
}
fun payWithCheck(amount: Double): Boolean{
    println("Check Payment Success!")
    return true
}
fun pay(amount: Double, method: PaymentMethod):Boolean{
    return when(method){
        PaymentMethod.CASH -> payWithCash(amount)
        PaymentMethod.CARD -> payWithCard(amount)
        PaymentMethod.CHECK -> payWithCheck(amount)
//        else -> {
//            println("Unknown payment method")
//            false
//        }// Using Enum Class kotlin knows there is no other payment
    }
}

enum class PaymentMethod{
    CASH,
    CARD,
    CHECK
}

fun main() {
    val success = pay(2000.0,PaymentMethod.CARD)
    println("Success: $success")

    println(PaymentMethod.CHECK.ordinal) // Prints the order of check in the class
    println(PaymentMethod.CASH.ordinal)  // Prints the order of cashs in the class
    println(PaymentMethod.CASH)

    for (method in PaymentMethod.values()){
        println("At ${method.ordinal} there is $method")
    }
}

