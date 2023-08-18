// EX1
//fun main() {
//    val a = 10
//    val b = 0 // if b=5 ,sum=2
//    val equal = try {
//        println("Inside Try")
//        a/b
//    }catch (e: Throwable){
//        println("Inside Catch")
//        println(e.message)
//        0
//    }
//    println("Equal = $equal")
//}

//EX2, When you want to throw an error when a condition happens

class IllegalVoterException(message: String):Exception(message)
// :Exception => this made the class an exception
fun vote(name: String,age: Int){
    if (age < 18) {
        // Throw will Throw the exception
        throw IllegalVoterException("$name is Young to Vote!")
    }else{println("$name Voted!")}
}

fun main() {
    val person2 = vote("Nichol",18)
    try {
        val person1 = vote("Micheal",12)
    }catch (e: Exception){
        println(e.message)
    }finally {
        // Final can be used to do a job at the end
        // Even if there is no Exception raised #Error
        println("This is Final.")
    }
//    println(person2)
}